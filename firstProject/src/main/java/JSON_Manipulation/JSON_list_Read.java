package JSON_Manipulation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class JSON_list_Read {
    public static void main(String[] args) throws IOException, ParseException {

//In utils class this work has done and can use it dynamically in utils main class
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader("./src/main/resources/EmployeeList.json"));
        //type-cast into json object or converting into json array
        JSONArray jsonArray = (JSONArray) obj;

        JSONObject jsonObject = (JSONObject) jsonArray.get(0);
        String name = (String) jsonObject.get("Name");

        System.out.println(name);

        JSONObject empbj = (JSONObject) jsonArray.get(1);
        String nam = (String) empbj.get("Name");

        System.out.println(nam);
    }


}
