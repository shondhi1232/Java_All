/*
3. Input 2 decimal numbers and check if they are both same or different up to two decimal places. E.g 120.546 & 120.241
 */

package if_else_loop;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.*;

public class decimal_numbers_check {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter 1st floating-point number: ");
        double FirstNumber = input.nextDouble();
        System.out.print("Enter 2nd floating-point number: ");
        double SecondNumber = input.nextDouble();

        DecimalFormat fn = new DecimalFormat("#.##");

        boolean b = (SecondNumber) <= 0.01;
        if ( abs(Float.valueOf(fn.format(FirstNumber))- Float.valueOf(fn.format(SecondNumber))) <= 0.01) {

                System.out.println("They are the same up to three decimal places");
        }
        else {
                System.out.println("They are different");
            }




    }
}
