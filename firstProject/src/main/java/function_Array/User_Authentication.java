/*
6. Suppose a software system excepts valid credentials from user to logged in to the system. if the user inputs wrong password for 3 times, system will say that "Your user has been temporary locked". Let the username: admin, password: admin@123

*/

package function_Array;

import java.util.Scanner;

public class User_Authentication {
    public static void main(String[] args) {

        Scanner match  = new Scanner(System.in);

        String username = "admin";

       String password= username+"@123";
        System.out.println(password);

        System.out.println("Enter User Name: ");
        String InputUserName = match.next();

        System.out.println("Enter Password: ");
        String input = match.next();

        login(password,InputUserName,username,input);

    }
    public static void login(String password, String name, String username,String input){
        Scanner match2  = new Scanner(System.in);

        if(username.equals(name)) {
            if (password.equals(input)) {
                System.out.println("Login Successfully");

            }
            else {
                System.out.println("Incorrect Password");
                for (int i = 1; i <= 3; i++) {

                    System.out.println("Enter Password again: ");
                    String pass = match2.next();

                    if (password.equals(pass)) {
                        System.out.println("Login Successfully");
                        System.exit(0);
                    }
                    else {
                        System.out.println("Incorrect Password");
                    }



                }
                System.out.println("Your user has been temporary locked");
            }
        }
        else {
            System.out.println("Incorrect Username ");
        }
    }
}
