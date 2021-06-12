package handlers;

import edu.pja.sri.hw06.stockexchangeservice.Coordinates;
import edu.pja.sri.hw06.stockexchangeservice.StockExchange;
import edu.pja.sri.hw06.stockexchangeservice.StockExchangeService;
import org.apache.thrift.TException;
import DataInitializer.DataInitializer;

import java.util.List;
import java.util.stream.Collectors;

public class StockExchangeServiceHandler implements StockExchangeService.Iface {

    private static List<StockExchange> stockExchanges = DataInitializer.initializeStockExchanges();


    @Override
    public List<StockExchange> getStockExchanges() throws TException {
        return stockExchanges;
    }

    // TODO: użyj Optional<StockExchange>; findFirst, findAny itp.
    @Override
    public StockExchange getStockExchangeByShortNameIntl(String shortNameIntl) throws TException {
        List<StockExchange> filteredStockExchanges = stockExchanges.stream()
                .filter(e -> e.getShortNameIntl().equals(shortNameIntl))
                .collect(Collectors.toList());
        return filteredStockExchanges.isEmpty() ? null : filteredStockExchanges.get(0);
    }
}
