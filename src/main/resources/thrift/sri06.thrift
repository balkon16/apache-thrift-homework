namespace java edu.pja.sri.hw06
//
//struct Product {
//    1: required i32 id;
//    2: required string name;
//    3: required double price;
//    4: required i32 inStock;
//}

struct StockExchange {
    1: required string shortNameIntl;
    2: required string fullNameIntl;
    3: required string shortNameLocal;
    4: required string address;
    // Czy chcę też czas otwarcia/zamknięcia?
}
// TODO: wyjątki odpowiednie do moich usług
//exception ProductUnvailable {
//    1: string message
//}

service StockExchangeService {
    list<StockExchange> getStockExchanges()
}

// TODO: dokończyć
//service StockPriceService {
//
//}

// TODO: dokończyć
//service ExchangeRateService {
//
//}
//
//service ProductManager {
//    list<Product> getProducts()
//    string sayHelloWithName(1: string name)
//}

