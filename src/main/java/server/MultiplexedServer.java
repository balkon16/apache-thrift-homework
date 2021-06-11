package server;

import edu.pja.sri.hw06.stockexchangeservice.StockExchangeService;
import edu.pja.sri.hw06.stockpriceservice.StockPriceService;
import handlers.StockExchangeServiceHandler;
import handlers.StockPriceServiceHandler;
import org.apache.thrift.TMultiplexedProcessor;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

public class MultiplexedServer
{
    public static void main(String[] args)
    {

        try {
            int port = 9090;
            TMultiplexedProcessor processor = new TMultiplexedProcessor();
            TServerTransport t = new TServerSocket(port);
            TServer server = new TThreadPoolServer(new TThreadPoolServer.Args(t).processor(processor));
            processor.registerProcessor("StockExchangeService", new StockExchangeService.Processor<StockExchangeService.Iface>(new StockExchangeServiceHandler()));
            processor.registerProcessor("StockPriceService", new StockPriceService.Processor<StockPriceService.Iface>(new StockPriceServiceHandler()));
//            processor.registerProcessor("MultiplyService", new  MultiplyService.Processor<MultiplyService.Iface>(new MultiplyServiceImpl()));
//            processor.registerProcessor("UserService", new  UserService.Processor<UserService.Iface>(new UserServiceImpl()));

            System.out.println("starting server port:" + port);
            server.serve();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}