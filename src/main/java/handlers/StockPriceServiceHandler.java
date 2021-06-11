package handlers;

import edu.pja.sri.hw06.stockpriceservice.StockPriceService;
import org.apache.thrift.TException;

public class StockPriceServiceHandler implements StockPriceService.Iface {
    @Override
    public String getStockPriceGreetings(String name) throws TException {
        return "Hello from StockPriceServiceHandler, " + name + "!";
    }
}
