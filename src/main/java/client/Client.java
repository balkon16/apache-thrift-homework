package client;

import edu.pja.sri.hw06.exchangerateservice.ExchangeRate;
import edu.pja.sri.hw06.exchangerateservice.ExchangeRateService;
import edu.pja.sri.hw06.stockexchangeservice.Coordinates;
import edu.pja.sri.hw06.stockexchangeservice.StatusMessage;
import edu.pja.sri.hw06.stockexchangeservice.StockExchange;
import edu.pja.sri.hw06.stockexchangeservice.StockExchangeService;
import edu.pja.sri.hw06.stockpriceservice.Price;
import edu.pja.sri.hw06.stockpriceservice.StockPrice;
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
            interactWithStockExchangeService(protocol);
            interactWithExchangeRateService(protocol);
            interactWithStockPriceService(protocol);

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
            System.out.println(ObjectToStringConverter.getStockExchangeAsString(stockExchange));
        }
        String selectedStockExchange = "WSE";
        System.out.println(String.format("\nGetting data for: %s", selectedStockExchange));
        StockExchange stockExchange = client.getStockExchangeByShortNameIntl(selectedStockExchange);
        if (!stockExchange.equals(null)) {
            System.out.println(ObjectToStringConverter.getStockExchangeAsString(stockExchange));
        }

        StockExchange newStockExchange = new StockExchange("SEB",
                "Stock Exchange of Barcelona",
                "BCN",
                "Passeig de Gr??cia, 19, 08007 Barcelona, Spain",
                new Coordinates(41.3901032678632, 2.1670982844580466));
        StatusMessage msg1 = client.addStockExchange(newStockExchange);
        System.out.println(msg1.message);
        StatusMessage msg2 = client.addStockExchange(newStockExchange);
        System.out.println(msg2.message);
        StatusMessage msg3 = client.addStockExchange(newStockExchange);
        System.out.println(msg3.message);
    }

    private static void interactWithExchangeRateService(TProtocol protocol) throws TException {
        TMultiplexedProtocol mp = new TMultiplexedProtocol(protocol, "ExchangeRateService");
        ExchangeRateService.Client client = new ExchangeRateService.Client(mp);
        System.out.println("\nquerySingleExchangeRate functionality:\n");
        System.out.println(querySingleExchangeRate(client, "EUR", "PLN", false));
        System.out.println(querySingleExchangeRate(client, "TJS", "PLN", true));
        System.out.println(querySingleExchangeRate(client, "RMB", "PLN", false));
        System.out.println(querySingleExchangeRate(client, "RMB", "PLN", true));

        System.out.println("getExchangeRatesForWindow functionality:");
        for (ExchangeRate exchangeRate : client.getExchangeRatesForWindow("EUR",
                "PLN", 0, 1622624402)) {
            System.out.println(ObjectToStringConverter.getExchangeRateAsString(exchangeRate));
        }
        System.out.println("\naddNewRate functionality:");
        StatusMessage sm1 = client.addNewRate(new ExchangeRate("CHF", "PLN", 1, 4.14, 1623402000));
        System.out.println(sm1.message);
        StatusMessage sm2 = client.addNewRate(new ExchangeRate("HUF", "PLN", 100, 1.2925, 1623402000));
        if (sm2.success) {
            System.out.println(querySingleExchangeRate(client, "HUF", "PLN", false));
        }

        System.out.println("\naddBulk functionality:");
        ExchangeRate er1 = new ExchangeRate("GBP", "PLN", 1, 5.2040, 1623402000);
        ExchangeRate er2 = new ExchangeRate("CLP", "USD", 100, 0.14, 1623402000);
        ExchangeRate er3 = new ExchangeRate("USD", "PLN", 1, 3.6759, 1623402300);
        StatusMessage bulkMsg = client.addBulk(List.of(er1, er2, er3));
        System.out.println(bulkMsg.message);
        if (bulkMsg.success) {
            System.out.println(querySingleExchangeRate(client, "CLP", "PLN", true));
        }
    }

    private static void interactWithStockPriceService(TProtocol protocol) throws TException {
        TMultiplexedProtocol mp = new TMultiplexedProtocol(protocol, "StockPriceService");
        StockPriceService.Client client = new StockPriceService.Client(mp);
        System.out.println("Get stock price functionality:");
        System.out.println(querySingleStockPrice(client, "WSE", "CDR"));
        System.out.println(querySingleStockPrice(client, "NYSE", "AAPL"));

        System.out.println("\nAdd stock price functionality:");
        StatusMessage msg = client.addNewQuotation(new StockPrice(
                "CCC", "PLN", 118.51, "WSE", 1623416715
        ));
        System.out.println(msg.message);

        long fromTimestamp1 = 1623157515;
        long toTimestamp1 = 1623416715;
        String ticker1 = "RDSA";
        String stockExchange1 = "LSE";
        System.out.printf("\nGetting max price for %s from %s to %s%n",
                ticker1,
                ObjectToStringConverter.convertTimestampToDateTimeString(fromTimestamp1),
                ObjectToStringConverter.convertTimestampToDateTimeString(toTimestamp1)
                );
        System.out.println(
                ObjectToStringConverter.getPriceAsString(
                        client.getMaxByWindow(stockExchange1, ticker1, fromTimestamp1, toTimestamp1)));

        long fromTimestamp2 = 1623157515;
        long toTimestamp2 = 1623416715;
        String ticker2 = "PLC";
        String stockExchange2 = "LSE";
        System.out.printf("Getting max price for %s from %s to %s%n",
                ticker2,
                ObjectToStringConverter.convertTimestampToDateTimeString(fromTimestamp2),
                ObjectToStringConverter.convertTimestampToDateTimeString(toTimestamp2)
        );
        System.out.println(
                ObjectToStringConverter.getPriceAsString(
                        client.getMaxByWindow(stockExchange2, ticker2, fromTimestamp2, toTimestamp2)));


        System.out.println("\nGetting exponential moving average:");
        Price CDRThreeObsPrice = client.getExponentialMovingAverage("WSE", "CDR", 3);
        System.out.println(ObjectToStringConverter.getPriceAsString(CDRThreeObsPrice));

    }

    private static String querySingleExchangeRate(ExchangeRateService.Client client, String baseCurrency, String quoteCurrency, boolean allowCross) {
        try {
            ExchangeRate er = client.getLatestExchangeRate(baseCurrency, quoteCurrency, allowCross);
            return ObjectToStringConverter.getExchangeRateAsString(er);

        } catch (TApplicationException e) {
            return String.format("Exchange rate %s/%s (cross allowed: %b) not found", baseCurrency, quoteCurrency, allowCross);
        } catch (TException e) {
            e.printStackTrace();
            return String.format("Exchange rate %s/%s (cross allowed: %b) not found", baseCurrency, quoteCurrency, allowCross);
        }
    }

    private static String querySingleStockPrice(StockPriceService.Client client, String stockExchange, String ticker){
        try {
            StockPrice sp = client.getLatestQuotation(stockExchange, ticker);
            return ObjectToStringConverter.getStockPriceAsString(sp);
        } catch (TApplicationException e) {
            return String.format("Stock price %s @ %s not found", ticker, stockExchange);
        } catch (TException e) {
            e.printStackTrace();
            return String.format("Stock price %s @ %s not found", ticker, stockExchange);
        }
    }
}
