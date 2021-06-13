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

    //TODO: implementacja
    @Override
    public Price getMaxByWindow(String stockExchange, String ticker, long fromTimestamp, long toTimestamp) throws TException {
        Optional<StockPrice> optionalStockPriceMax = stockPrices.stream()
                .filter(s -> s.getStockExchangeShortNameIntl().equals(stockExchange))
                .filter(s -> s.getTicker().equals(ticker))
                .filter(s -> s.getTimestamp() <= toTimestamp & s.getTimestamp() >= fromTimestamp)
                .max(Comparator.comparingDouble(StockPrice::getPrice));
        // TODO: przerobić tak, żeby zwracany był obiekt Price
        return null;
//        return optionalStockPriceMax.orElse(null);
    }


    //TODO: implementacja -> https://pl.wikipedia.org/wiki/%C5%9Arednia_ruchoma
    @Override
    public Price getExponentialMovingAverage(String stockExchange, String ticker, long observationCount) throws TException {
        return null;
    }
}
