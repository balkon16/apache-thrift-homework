//TODO: przenieść do pliku wyżej

package client;

import edu.pja.sri.hw06.exchangerateservice.ExchangeRate;
import edu.pja.sri.hw06.exchangerateservice.ExchangeRateService;
import edu.pja.sri.hw06.stockexchangeservice.StockExchange;
import edu.pja.sri.hw06.stockexchangeservice.StockExchangeService;
import edu.pja.sri.hw06.stockpriceservice.StockPriceService;
import org.apache.thrift.TApplicationException;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TMultiplexedProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        try {
            TTransport transport;

            transport = new TSocket("localhost", 9090);
            transport.open();

            TProtocol protocol = new TBinaryProtocol(transport);
//            interactWithStockExchangeService(protocol);
            interactWithExchangeRateService(protocol);
            // TODO: przenieść do oddzielnej metody


            TMultiplexedProtocol mp2 = new TMultiplexedProtocol(protocol, "StockPriceService");
            StockPriceService.Client stockPriceClient = new StockPriceService.Client(mp2);
//            System.out.println(stockPriceClient.getStockPriceGreetings("Paweł"));
//            System.out.println(multiplyClient.multiply(1, 3));
//		      ProductManager.Client productManagerclient = new ProductManager.Client(protocol);
//
//		      perform(productManagerclient);
//
            transport.close();
        } catch (TException x) {
            x.printStackTrace();
        }
    }

    private static void interactWithStockExchangeService(TProtocol protocol) throws TException {
        TMultiplexedProtocol mp = new TMultiplexedProtocol(protocol, "StockExchangeService");
        StockExchangeService.Client client = new StockExchangeService.Client(mp);
        System.out.println("Available stock exchanges:");
        List<StockExchange> stockExchanges = client.getStockExchanges();
        for (StockExchange stockExchange : stockExchanges) {
            System.out.println(stockExchange);
        }
        String selectedStockExchange = "WSE";
        System.out.println("Data for " + selectedStockExchange + ":");
        StockExchange stockExchange = client.getStockExchangeByShortNameIntl(selectedStockExchange);
        if (!stockExchange.equals(null)) {
            System.out.println(stockExchange);
        }
    }

    private static void interactWithExchangeRateService(TProtocol protocol) throws TException {
        TMultiplexedProtocol mp = new TMultiplexedProtocol(protocol, "ExchangeRateService");
        ExchangeRateService.Client client = new ExchangeRateService.Client(mp);
//        ExchangeRate EURPLNRate = client.getLatestExchangeRate("EUR", "PLN", false);
//        System.out.println("EUR/PLN rate: " + EURPLNRate.getRate());
//        ExchangeRate TJSPLNRate = client.getLatestExchangeRate("TJS", "PLN", true);
//        System.out.println("TJS/PLN (with cross) rate: " + TJSPLNRate.getRate());
        // TODO: przerobić przykłady powyżej na querySingleExchangeRate.
        String exchangeRateInfo = querySingleExchangeRate(client, "RMB", "PLN", false);
        System.out.println(exchangeRateInfo);
        //TODO: zaprezentować metody:
        //  1. getExchangeRatesForWindow
        //  2. addNewRate
        //  3. addBulk
    }

    private static void interactWithStockPriceService(TProtocol protocol) throws TException {
        //TODO: zaimplementować
    }

    protected static String querySingleExchangeRate(ExchangeRateService.Client client, String baseCurrency, String quoteCurrency, boolean allowCross) {
        try {
            ExchangeRate er = client.getLatestExchangeRate(baseCurrency, quoteCurrency, allowCross);
            return er.toString();
        } catch (TApplicationException e) {
            return String.format("Exchange rate %s/%s (cross allowed: %b) not found", baseCurrency, quoteCurrency, allowCross);
        } catch (TException e) {
            e.printStackTrace();
            return String.format("Exchange rate %s/%s (cross allowed: %b) not found", baseCurrency, quoteCurrency, allowCross);
        }
    }
}
