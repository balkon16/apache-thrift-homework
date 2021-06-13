package handlers;

import DataInitializer.DataInitializer;
import edu.pja.sri.hw06.stockexchangeservice.StatusMessage;
import edu.pja.sri.hw06.stockpriceservice.Price;
import edu.pja.sri.hw06.stockpriceservice.StockPrice;
import edu.pja.sri.hw06.stockpriceservice.StockPriceService;
import org.apache.thrift.TException;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StockPriceServiceHandler implements StockPriceService.Iface {

    List<StockPrice> stockPrices = DataInitializer.initializeStockPrice();

    @Override
    public StockPrice getLatestQuotation(String stockExchange, String ticker) throws TException {
        Optional<StockPrice> optionalStockPrice = stockPrices.stream()
                .filter(s -> s.getStockExchangeShortNameIntl().equals(stockExchange))
                .filter(s -> s.getTicker().equals(ticker))
                .max(Comparator.comparingLong(StockPrice::getTimestamp));

        return optionalStockPrice.orElse(null);

    }

    @Override
    public StatusMessage addNewQuotation(StockPrice newStockPrice) throws TException {
        stockPrices.add(newStockPrice);
        return new StatusMessage(true,
                String.format("%s@%f %s added successfully.", newStockPrice.getTicker(), newStockPrice.getPrice(), newStockPrice.getCurrency()));
    }

    @Override
    public Price getMaxByWindow(String stockExchange, String ticker, long fromTimestamp, long toTimestamp) throws TException {
        Optional<StockPrice> optionalStockPriceMax = stockPrices.stream()
                .filter(s -> s.getStockExchangeShortNameIntl().equals(stockExchange))
                .filter(s -> s.getTicker().equals(ticker))
                .filter(s -> s.getTimestamp() <= toTimestamp & s.getTimestamp() >= fromTimestamp)
                .max(Comparator.comparingDouble(StockPrice::getPrice));
        return optionalStockPriceMax
                .map(stockPrice -> new Price(stockPrice.getPrice(), stockPrice.getCurrency()))
                .orElseGet(() -> new Price(-1.0, ""));
    }

    @Override
    public Price getExponentialMovingAverage(String stockExchange, String ticker, int observationCount) throws TException {
        List<StockPrice> filteredStockPrices = stockPrices.stream()
                .filter(s -> s.getTicker().equals(ticker))
                .filter(s -> s.getStockExchangeShortNameIntl().equals(stockExchange))
                .sorted(Comparator.comparingLong(StockPrice::getTimestamp).reversed())
                .limit(observationCount)
                .collect(Collectors.toList());
        if (filteredStockPrices.isEmpty()) {
            return new Price(-1.0, "");
        }

        double alpha = (2.0 / (filteredStockPrices.size() + 1.0));
        double numerator = 0.0;
        double denominator = 0.0;
        for (int i = 0; i < filteredStockPrices.size(); i++) {
            double weight = Math.pow(1 - alpha, i);
            numerator += weight*filteredStockPrices.get(i).getPrice();
            denominator += weight;
        }

        return new Price(numerator / denominator, filteredStockPrices.stream().findFirst().get().getCurrency());
    }
}
