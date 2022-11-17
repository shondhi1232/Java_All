/*
4. Write a program to check balance and withdraw money from ATM booth using if else or switch case
 */

package if_else_loop;

import java.util.Scanner;

public class Check_Balance_And_withdrawMoney_FromATM {
    public static void main(String[] args) {

        Scanner option = new Scanner(System.in);

        int balance = 80000,pin=1234 ,withdraw;

        int max = 500;
        int min = 100;
        double rand = Math.random()*(max - min) + min;
        int id = (int) Math.floor(rand);

        System.out.println("\nProve you are not a robot:\nEnter code "+id+"");
        int prove = option.nextInt();

        System.out.println("         \\\\ Welcome to \\\\");
        System.out.println("    \"Automated Teller Machine\"\n----------------------------------");

        if(id == prove) {

            System.out.println("Enter your pin code here");
            int pinCode = option.nextInt();

            while (pin == pinCode ) {

                System.out.println("Choose the option you want to perform:");
                System.out.println("Choose 1 for Check Balance");
                System.out.println("Choose 2 for Withdraw");
                System.out.println("Choose 3 for EXIT");

                System.out.print("\nEnter your choice:");
                int choice = option.nextInt();

                switch (choice) {
                    case 1:

                        System.out.println("Your current Balance : " + balance + "tk\n");
                        break;

                    case 2:

                        System.out.print("Enter money to be withdrawn:");

                        withdraw = option.nextInt();

                        if (withdraw <= 400) {

                            System.out.println("Minimum withdraw amount is 500tk\n");
                            System.exit(0);
                        }

                        //check whether the balance is greater than or equal to the withdrawal amount
                        else if (balance >= withdraw) {

                            //remove the withdrawal amount from the total balance
                            balance = balance - withdraw;
                            System.out.println("Please collect your money\n");
                        } else {

                            System.out.println("Insufficient Balance\n");
                        }

                        break;

                    case 3:
                        System.exit(0);

                }

            }
        }
    }

}


