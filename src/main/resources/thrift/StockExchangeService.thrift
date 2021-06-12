namespace java edu.pja.sri.hw06.stockexchangeservice

struct Coordinates {
    1: required double latitude;
    2: required double longitude;
}

struct StatusMessage {
    1: required bool success;
    2: required string message;
}

struct StockExchange {
    1: required string shortNameIntl;
    2: required string fullNameIntl;
    3: required string shortNameLocal;
    4: required string address;
    5: required Coordinates coordinates;
}

typedef list<StockExchange> StockExchangeList

service StockExchangeService {
    StockExchangeList getStockExchanges();
    StockExchange getStockExchangeByShortNameIntl(1: string shortNameIntl);
    StatusMessage addStockExchange(1: StockExchange newStockExchange);
}


