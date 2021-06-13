namespace java edu.pja.sri.hw06.stockpriceservice
include "StockExchangeService.thrift"

struct StockPrice {
    1: required string ticker;
    2: required string currency;
    3: required double price;
    4: required string stockExchangeShortNameIntl;
    5: required i64 timestamp;
}

struct Price {
    1: required double price;
    2: required string currency;
}


service StockPriceService {
    StockPrice getLatestQuotation(1: string stockExchange, 2: string ticker);
    StockExchangeService.StatusMessage addNewQuotation(1: StockPrice newStockPrice);
    Price getMaxByWindow(1: string stockExchange, 2: string ticker, 3: i64 fromTimestamp, 4: i64 toTimestamp);
    Price getExponentialMovingAverage(1: string stockExchange, 2: string ticker, 3: i64 observationCount);
}