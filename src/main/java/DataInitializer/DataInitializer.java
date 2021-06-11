package DataInitializer;

import edu.pja.sri.hw06.stockexchangeservice.Coordinates;
import edu.pja.sri.hw06.stockexchangeservice.StockExchange;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DataInitializer {

    public DataInitializer() {
    }

    // TODO: metoda do zainicjalizowania StockExchangeService
    private static final String dataDirectory = "src/main/resources/data";

    private static JSONArray readJSONFile(String fileName) throws IOException, ParseException {
        Object parsedFile = new JSONParser().parse(new FileReader(dataDirectory + "/" + fileName));
        return (JSONArray) parsedFile;
    }

    public static List<StockExchange> initializeStockExchanges() {
        List<StockExchange> stockExchanges = null;
        try {
            JSONArray objectsArray = readJSONFile("StockExchangeExampleData.json");
            stockExchanges = new ArrayList<StockExchange>();
            for (Object obj : objectsArray) {
                JSONObject jsonObject = (JSONObject) obj;
                JSONObject coordinatesObject = (JSONObject) jsonObject.get("coordinates");
                stockExchanges.add(new StockExchange((String) jsonObject.get("shortNameIntl"),
                        (String) jsonObject.get("fullNameIntl"),
                        (String) jsonObject.get("shortNameLocal"),
                        (String) jsonObject.get("address"),
                        new Coordinates((double) coordinatesObject.get("latitude"), (double) coordinatesObject.get("longitude"))
                ));
            }
            return stockExchanges;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return stockExchanges;
    }

    public static void main(String[] args) throws IOException, ParseException {
        List<StockExchange> stockExchanges = initializeStockExchanges();
        System.out.println(stockExchanges);
        List<StockExchange> wse = stockExchanges.stream()
                .filter(e -> e.getShortNameIntl().equals("WSE"))
                .collect(Collectors.toList());
        System.out.println(wse.get(0));
    }

}
