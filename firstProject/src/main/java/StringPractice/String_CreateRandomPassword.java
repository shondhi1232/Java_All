package StringPractice;

import java.util.Random;
import java.util.Scanner;

public class String_CreateRandomPassword {
    public static void main(String[] args) {
        String_CreateRandomPassword cpr = new String_CreateRandomPassword();

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number for your password length :");
        int input = scan.nextInt();

        System.out.print(cpr.generateRandomPass(input));

    }
    public String generateRandomPass(int len){

        String passChar = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%&*";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i=0;i<len;i++){
            sb.append(passChar.charAt(rand.nextInt(passChar.length())));
        }
        return sb.toString();
    }
}
