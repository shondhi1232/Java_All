/*
9. Write a program to sum of user input until users input ‘q’ from keyboard
 */

package if_else_loop;

import java.util.Scanner;

public class sumOfUserInputs_until_input_q {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

        int  letter;
        int sum =  0;

        System.out.println("Do you want perform ? if yes then enter 1");
        int choice = scan.nextInt();
        while (choice==1) {

            do {

                System.out.println("Please Enter integer number:");
                sum = sum + scan.nextInt();
                System.out.println("summation of total number " + sum);


                System.out.println("If you want to continue then Enter any digit except q:");
                letter = scan.next().charAt(0);
            }

            while (letter != 'q') ;


        }


    }
}
