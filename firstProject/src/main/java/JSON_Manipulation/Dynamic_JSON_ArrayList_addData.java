package JSON_Manipulation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Dynamic_JSON_ArrayList_addData {
    public static void main(String[] args) throws IOException, ParseException {

        char ch = 'y';
        Scanner scan;
        do {
            String fileName = "./src/main/resources/EmployeeList.json";
            scan = new Scanner(System.in);
            JSONParser jsonParser = new JSONParser();
            Object obj = jsonParser.parse(new FileReader(fileName));
            //type-cast into json object or converting into json array
            JSONArray jsonArray = (JSONArray) obj;

            JSONObject emp_jb = new JSONObject();
            System.out.println("Write employee name");
            emp_jb.put("Name",scan.nextLine());
            System.out.println("Write Department name");
            emp_jb.put("Department",scan.nextLine());
            //input add into json array
            jsonArray.add(emp_jb);

            //input save in jason array / json file
            FileWriter FileWriter = new FileWriter(fileName);
            FileWriter.write(jsonArray.toString());
            FileWriter.flush();
            System.out.println("Saved!");

            System.out.println("\nDo you want to add more?[y/n]");
            ch = scan.next().charAt(0);
        }
        while (ch!='n');
    }
}
