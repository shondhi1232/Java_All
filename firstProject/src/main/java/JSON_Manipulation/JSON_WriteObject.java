package JSON_Manipulation;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class JSON_WriteObject {
    public static void main(String[] args) throws IOException {
        JSONObject emp_jb = new JSONObject();
        emp_jb.put("Name","Shondhi");
        emp_jb.put("Department","Software engineering");
        emp_jb.put("PhoneNumber","00289378");

        //System.out.println(jb);

        JSONObject adress = new JSONObject();
        adress.put("House no.","RA");
        adress.put("Thana","Dhanmondi");
        adress.put("Area","Dhaka");

        emp_jb.put("Address",adress);

        System.out.println(emp_jb);

        FileWriter FileWriter = new FileWriter("./src/main/resources/Employee.json");
        FileWriter.write(emp_jb.toString());
        FileWriter.flush();
    }

}
