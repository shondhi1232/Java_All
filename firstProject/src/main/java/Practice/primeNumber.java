package Practice;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int  i, flag=1;

        // Ask user to enter lower value of interval
        System.out.printf("Enter lower bound of the value: ");
        int number = sc.nextInt(); // Take input

        // Ask user to enter upper value of interval
        System.out.printf("\nEnter upper bound of the value: ");
        int count = sc.nextInt(); // Take input

        // Print display message
        System.out.printf("\nPrime numbers between %d and %d are: \n", number, count);


            for (i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    flag = 0;
                    break;
                }
            }

            // flag = 1 means i is prime
            // and flag = 0 means i is not prime
            if (flag == 1){
                System.out.println(i+" is the prime number");
            }
            else {
                System.out.println(i+" is not a prime number");
            }

    }
}


