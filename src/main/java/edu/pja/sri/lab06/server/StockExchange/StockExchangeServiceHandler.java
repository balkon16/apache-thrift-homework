package edu.pja.sri.lab06.server.StockExchange;

import java.util.List;

import edu.pja.sri.hw06.StockExchange;
import edu.pja.sri.hw06.StockExchangeService;
import org.apache.thrift.TException;

public class StockExchangeServiceHandler implements StockExchangeService.Iface {


    @Override
    public List<StockExchange> getStockExchanges() throws TException {
        return null;
    }
}
