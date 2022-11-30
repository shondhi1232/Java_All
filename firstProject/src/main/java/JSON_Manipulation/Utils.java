package JSON_Manipulation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class Utils {

    public JSONObject readJsonList(String fileName, int position) throws IOException, ParseException {

        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(fileName));
        //type-cast into json object or converting into json array
        JSONArray jsonArray = (JSONArray) obj;
        JSONObject jsonObj = (JSONObject) jsonArray.get(position);

        return jsonObj;
    }
    public JSONObject readJsonObject(String fileName) throws IOException, ParseException {

        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(fileName));
        //type-cast into json object or converting into json object
        JSONObject jsonObject = (JSONObject) obj;

        return jsonObject;
    }
}
