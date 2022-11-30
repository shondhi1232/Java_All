package JSON_Manipulation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class UtilsMain {
    public static void main(String[] args)throws IOException, ParseException{
        Utils utils = new Utils();
        //json array
        JSONObject empbj =  utils.readJsonList("./src/main/resources/EmployeeList.json",0);
        String name = (String) empbj.get("Name");
        System.out.println(name);

        //json object
        JSONObject empObj =  utils.readJsonObject("./src/main/resources/Employee.json");
        JSONObject adrs = (JSONObject) empObj.get("Address");
        String area = (String) adrs.get("Area");
        System.out.println(area);
    }
}
