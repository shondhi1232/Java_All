/*
10. Write a program to enter the numbers till the user wants and at the end, the program should display the largest and smallest numbers user entered.
 */

package if_else_loop;

import java.util.Scanner;

public class display_largest_and_smallest_numbers_user_entered {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char  letter;
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        int sum;

        do {

            System.out.println("Please Enter integer number:");
            sum =  scan.nextInt();

            if(sum >= maxValue)
            {
                maxValue = sum;
            }

            if(sum <= minValue)
            {
                minValue = sum;
            }

            System.out.println("If you want to continue then Enter any digit except A:");
            letter = scan.next().charAt(0);
        }

        while (letter != 'A') ;

        System.out.println("The largest number is " + maxValue);
        System.out.println("The smallest number is " + minValue);


    }
}
