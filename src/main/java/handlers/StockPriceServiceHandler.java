package handlers;

import edu.pja.sri.hw06.stockexchangeservice.StatusMessage;
import edu.pja.sri.hw06.stockpriceservice.Price;
import edu.pja.sri.hw06.stockpriceservice.StockPrice;
import edu.pja.sri.hw06.stockpriceservice.StockPriceService;
import org.apache.thrift.TException;

public class StockPriceServiceHandler implements StockPriceService.Iface {
    //TODO: implementacja
    @Override
    public StockPrice getLatestQuotation(String stockExchange, String ticker) throws TException {
        return null;
    }

    //TODO: implementacja
    @Override
    public StatusMessage updateQuotation(StockPrice newStockPrice) throws TException {
        return null;
    }

    //TODO: implementacja
    @Override
    public StatusMessage addNewQuotation(StockPrice newStockPrice) throws TException {
        return null;
    }

    //TODO: implementacja
    @Override
    public StockPrice getMaxByWindow(long fromTimestamp, long toTimestamp) throws TException {
        return null;
    }

    //TODO: implementacja -> https://pl.wikipedia.org/wiki/%C5%9Arednia_ruchoma
    @Override
    public Price getExponentialMovingAverage(String stockExchange, String ticker, long observationCount) throws TException {
        return null;
    }
}
