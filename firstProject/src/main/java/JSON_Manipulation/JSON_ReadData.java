package JSON_Manipulation;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.text.ParseException;
import java.io.IOException;

public class JSON_ReadData {
    public static void main(String[] args) throws IOException, ParseException, org.json.simple.parser.ParseException {

        //In utils class this work has done and can use it dynamically in utils main class------------------

        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader("./src/main/resources/Employee.json"));
        //type-cast into json object
        JSONObject empObj = (JSONObject) obj;
        //type-cast json object into String data type
        String name = (String) empObj.get("Name");
        System.out.println(name);


        //As it's another JSONobject in emp JSONobject that's why you need to type-cast again. otherwise you'll get error.
        JSONObject adrs = (JSONObject) empObj.get("Address");
        //it will show as Json data
        System.out.println(adrs);

        //you can get any data as string type from address jsonObject
        //type-cast json object into String data type
        String area = (String) adrs.get("Area");
        System.out.println(area);

    }
}
