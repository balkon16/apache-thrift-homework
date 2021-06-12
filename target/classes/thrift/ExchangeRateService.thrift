namespace java edu.pja.sri.hw06.exchangerateservice
include "StockExchangeService.thrift"


struct ExchangeRate {
    1: required string baseCurrency;
    2: required string quoteCurrency;
    3: required i64 multiplier;
    4: required double rate;
    5: required i64 timestamp;
}

typedef list<ExchangeRate> ExchangeRateList

service ExchangeRateService {
    ExchangeRate getLatestExchangeRate(1: string baseCurrency, 2: string quoteCurrency, 3: bool allowCross);
    ExchangeRateList getExchangeRatesForWindow(1: string baseCurrency, 2: string quoteCurrency, 3: i64 fromTimestamp, 4: i64 toTimestamp);
    StockExchangeService.StatusMessage addNewRate(1: ExchangeRate newRate);
    StockExchangeService.StatusMessage addBulk(1: ExchangeRateList newRates);
    //TODO: najnowszy kurs dla pary X/Y
    //TODO: kursy dla pary z zadanego okresu
    //TODO: kurs dla pary -> cross, np. MNT / PLN (z okna czasowego do 1h wstecz/przód)
    //TODO: dodaj kurs
    //TODO: dodaj więcej niż jeden kurs
}