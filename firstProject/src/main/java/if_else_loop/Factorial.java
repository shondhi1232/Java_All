/*
6. Write  a program to find the factorial of a given number
 */

package if_else_loop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

        int factorial=1;

        System.out.print("Enter the number to fine factorial : ");
        int number = input.nextInt();

        for(int i=1;i<=number;i++){
            factorial = factorial * i;
        }
        System.out.println ("Factorial of "+number+" is: "+factorial);

    }
}
