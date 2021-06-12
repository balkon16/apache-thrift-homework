namespace java edu.pja.sri.hw06.stockpriceservice

struct StockPrice {
    1: required string ticker;
    2: required string currency;
    3: required double price;
    4: required string stockExchangeShortNameIntl;
    5: required i64 timestamp;
}


service StockPriceService {
    //TODO: najnowszy kurs dla tickera i giełdy
    //TODO: zaktualizuj kurs dla zadanego tickera, giełdy i timestamp
    //TODO: najwyższy kurs w zadanym okresie
    //TODO: średnia krocząca dla zadanego okresu
}