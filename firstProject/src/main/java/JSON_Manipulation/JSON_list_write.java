package JSON_Manipulation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class JSON_list_write {
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader("./src/main/resources/EmployeeList.json"));
        //type-cast into json object or converting into json array
        JSONArray jsonArray = (JSONArray) obj;

       // System.out.println(jsonArray);

        JSONObject emp_jb = new JSONObject();
        emp_jb.put("Name","Limon");
        emp_jb.put("Department","Software engineering");

        jsonArray.add(emp_jb);

        System.out.println(jsonArray);


        FileWriter FileWriter = new FileWriter("./src/main/resources/EmployeeList.json");
        FileWriter.write(jsonArray.toString());
        FileWriter.flush();
    }
}
