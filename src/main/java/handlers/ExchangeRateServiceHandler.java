package handlers;

import DataInitializer.DataInitializer;
import edu.pja.sri.hw06.exchangerateservice.ExchangeRate;
import edu.pja.sri.hw06.exchangerateservice.ExchangeRateService;
import edu.pja.sri.hw06.stockexchangeservice.StatusMessage;
import org.apache.thrift.TException;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExchangeRateServiceHandler implements ExchangeRateService.Iface {

    private static final int TIMESTAMP_MARGIN = 3600; //3600s = 1h
    List<ExchangeRate> exchangeRates = DataInitializer.initializeExchangeRates();

    @Override
    public ExchangeRate getLatestExchangeRate(String baseCurrency, String quoteCurrency, boolean allowCross) throws TException {
        Optional<ExchangeRate> exchangeRate = exchangeRates.stream()
                .filter(e -> e.getBaseCurrency().equals(baseCurrency))
                .filter(e -> e.getQuoteCurrency().equals(quoteCurrency))
                .max(Comparator.comparingLong(ExchangeRate::getTimestamp));

        if (allowCross & exchangeRate.isEmpty()) {
            return getExchangeRateWithCross(baseCurrency, quoteCurrency, TIMESTAMP_MARGIN);
        } else if (exchangeRate.isEmpty()){
            System.out.println("ExchangeRate is empty.");
            return null;
        }
        return exchangeRate.get();
    }

    @Override
    public List<ExchangeRate> getExchangeRatesForWindow(String baseCurrency, String quoteCurrency, long fromTimestamp,
                                                        long toTimestamp) throws TException {
        return exchangeRates.stream()
                .filter(e -> e.getBaseCurrency().equals(baseCurrency))
                .filter(e -> e.getQuoteCurrency().equals(quoteCurrency))
                .filter(e -> e.getTimestamp() >= fromTimestamp)
                .filter(e -> e.getTimestamp() <= toTimestamp)
                .collect(Collectors.toList());
    }

    @Override
    public StatusMessage addNewRate(ExchangeRate newRate) throws TException {
        exchangeRates.add(newRate);
        return new StatusMessage(true, "Insert successful.");
    }

    @Override
    public StatusMessage addBulk(List<ExchangeRate> newRates) throws TException {
        exchangeRates.addAll(newRates);
        return new StatusMessage(true, "Successfully inserted " + newRates.size() + " items.");
    }

    private boolean isTimestampInRange(long analyzedTimestamp, long baseTimestamp, int timeRange) {
        return Math.abs(analyzedTimestamp - baseTimestamp) <= timeRange;
    }

    private ExchangeRate getExchangeRateWithCross(String baseCurrency, String quoteCurrency, int timeRange) {
        // exotic currencies are always defined in terms of the US Dollar.
        // try to find an <exotic>/USD quotation
        Optional<ExchangeRate> exoticUSD = exchangeRates.stream()
                .filter(e -> e.getBaseCurrency().equals(baseCurrency))
                .filter(e -> e.getQuoteCurrency().equals("USD"))
                .max(Comparator.comparingLong(ExchangeRate::getTimestamp));

        if (exoticUSD.isPresent()) {
            // try to find a USD/<quoteCurrency> quotation
            Optional<ExchangeRate> USDQuote = exchangeRates.stream()
                    .filter(e -> e.getBaseCurrency().equals("USD"))
                    .filter(e -> e.getQuoteCurrency().equals(quoteCurrency))
                    .filter(e -> isTimestampInRange(e.getTimestamp(), exoticUSD.get().getTimestamp(), timeRange))
                    .max(Comparator.comparingLong(ExchangeRate::getTimestamp));
            return USDQuote.map(exchangeRate -> new ExchangeRate(baseCurrency,
                    quoteCurrency,
                    (short) 1,
                    exchangeRate.getRate() * exoticUSD.get().getRate() / exoticUSD.get().getMultiplier(),
                    exoticUSD.get().getTimestamp()))
                    .orElse(null);
        }
        return null;

    }


}
