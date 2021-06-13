package client;

import edu.pja.sri.hw06.exchangerateservice.ExchangeRate;
import edu.pja.sri.hw06.stockexchangeservice.Coordinates;
import edu.pja.sri.hw06.stockexchangeservice.StockExchange;
import edu.pja.sri.hw06.stockpriceservice.Price;
import edu.pja.sri.hw06.stockpriceservice.StockPrice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class ObjectToStringConverter {
    public static String getExchangeRateAsString(ExchangeRate er) {
        return String.format("Exchange rate 1 %s is:\n\t%f %s\n\t@ %s",
                er.getBaseCurrency(),
                er.getRate() / er.getMultiplier(),
                er.getQuoteCurrency(),
                convertTimestampToDateTimeString(er.getTimestamp()));
    }

    public static String getStockPriceAsString(StockPrice sp) {
        return String.format("%s @%f %s (%s)",
                sp.getTicker(),
                sp.getPrice(),
                sp.getCurrency(),
                convertTimestampToDateTimeString(sp.getTimestamp())
                );
    }

    public static String getStockExchangeAsString(StockExchange se) {
        Coordinates coords = se.getCoordinates();
        String latStr = coords.latitude >=0 ? coords.latitude + " N" : Math.abs(coords.latitude) + " S";
        String lonStr = coords.longitude >=0 ? coords.longitude + " E" : Math.abs(coords.longitude) + " W";

        return String.format("%s (%s/%s)\n\tlocated at %s (%s, %s)",
                se.getFullNameIntl(),
                se.getShortNameIntl(),
                se.getShortNameLocal(),
                se.getAddress(),
                latStr,
                lonStr
                );
    }

    public static String getPriceAsString(Price p) {
        return String.format("%f %s", p.getPrice(), p.getCurrency());
    }

    public static String convertTimestampToDateTimeString(long timestamp) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dt = LocalDateTime.ofEpochSecond(timestamp, 0, ZoneOffset.UTC);
        return dt.format(dateTimeFormatter);
    }

}
