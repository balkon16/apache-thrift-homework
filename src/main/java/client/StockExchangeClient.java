//TODO: przenieść do pliku wyżej

package client;

import edu.pja.sri.hw06.stockexchangeservice.StockExchange;
import edu.pja.sri.hw06.stockexchangeservice.StockExchangeService;
import edu.pja.sri.hw06.stockpriceservice.StockPriceService;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TMultiplexedProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import java.util.List;

public class StockExchangeClient {
    public static void main(String[] args) {
        try {
            TTransport transport;

            transport = new TSocket("localhost", 9090);
            transport.open();

            TProtocol protocol = new TBinaryProtocol(transport);
            TMultiplexedProtocol mp = new TMultiplexedProtocol(protocol, "StockExchangeService");
            StockExchangeService.Client stockExchangeClient = new StockExchangeService.Client(mp);

            System.out.println("Available stock exchanges:");
            List<StockExchange> stockExchanges = stockExchangeClient.getStockExchanges();
            for (StockExchange stockExchange: stockExchanges){
                System.out.println(stockExchange);
            }
            String selectedStockExchange = "WSE";
            System.out.println("Data for " + selectedStockExchange + ":");
            StockExchange stockExchange = stockExchangeClient.getStockExchangeByShortNameIntl(selectedStockExchange);
            if (!stockExchange.equals(null)) {
                System.out.println(stockExchange);
            }

            TMultiplexedProtocol mp2 = new TMultiplexedProtocol(protocol, "StockPriceService");
            StockPriceService.Client stockPriceClient = new StockPriceService.Client(mp2);
            System.out.println(stockPriceClient.getStockPriceGreetings("Paweł"));
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

//    private static void perform(ProductManager.Client productManagerclient) throws TException {
//
//        List<Product> allProducts = productManagerclient.getProducts();
//        System.out.println(allProducts);
//        String greetingWithName = productManagerclient.sayHelloWithName("Paweł");
//        System.out.println(greetingWithName);
//    }
}
