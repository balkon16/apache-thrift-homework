package handlers;

import edu.pja.sri.hw06.stockexchangeservice.StatusMessage;
import edu.pja.sri.hw06.stockexchangeservice.StockExchange;
import edu.pja.sri.hw06.stockexchangeservice.StockExchangeService;
import org.apache.thrift.TException;
import DataInitializer.DataInitializer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StockExchangeServiceHandler implements StockExchangeService.Iface {

    private static HashSet<StockExchange> stockExchanges = DataInitializer.initializeStockExchanges();


    @Override
    public List<StockExchange> getStockExchanges() throws TException {
        return new ArrayList<>(stockExchanges);
    }

    @Override
    public StockExchange getStockExchangeByShortNameIntl(String shortNameIntl) throws TException {
        List<StockExchange> filteredStockExchanges = stockExchanges.stream()
                .filter(e -> e.getShortNameIntl().equals(shortNameIntl))
                .collect(Collectors.toList());
        return filteredStockExchanges.isEmpty() ? null : filteredStockExchanges.get(0);
    }

    @Override
    public StatusMessage addStockExchange(StockExchange newStockExchange) throws TException {
        StatusMessage statusMessage;
        Optional<StockExchange> existingStockExchange = stockExchanges.stream()
                .filter(s -> s.getShortNameIntl().equals(newStockExchange.getShortNameIntl()))
                .findFirst();
        if (existingStockExchange.isEmpty()) {
            stockExchanges.add(newStockExchange);
            statusMessage = new StatusMessage(true,
                    String.format("%s added.", newStockExchange.getFullNameIntl()));
        } else {
            statusMessage = new StatusMessage(false,
                    String.format("%s already exists.", newStockExchange.getFullNameIntl()));
        }
        return statusMessage;


    }
}
