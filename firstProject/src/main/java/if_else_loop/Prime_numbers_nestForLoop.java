/*
7. Write a program to print prime numbers from 2 to n
 */
package if_else_loop;

import java.util.Scanner;

public class Prime_numbers_nestForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i, j;
        boolean flag;

        System.out.println("Enter the starting boundary integer value:");
        int number = input.nextInt();

        System.out.println("Enter the ending boundary integer value:");
        int count = input.nextInt();

        /// checking if the number will be prime number or not.
        for (i = number; i <= count; i++) {

                flag = true;

            for (j = 2; j <= i / 2; ++j) {

                if (i % j == 0) {
                    if(i==1||i==0)
                        continue;
                    flag = false;
                    break;
                }

            }

            if (flag == true) {
                System.out.println(i+" is the prime number");
            }
            else {
                System.out.println(i+" is not a prime number");
            }

        }
    }
}
