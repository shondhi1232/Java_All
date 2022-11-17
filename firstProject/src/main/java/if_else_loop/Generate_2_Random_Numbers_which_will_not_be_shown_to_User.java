/*
8. Write a program to generate 2 random numbers which will not be shown to the user. Take a user input and match it with any of the random numbers. If correct give it 1 point and if incorrect, do not give it any point. Finally, repeat this for 10 times and count the point user achieved.
 */

package if_else_loop;

import java.util.Scanner;

public class Generate_2_Random_Numbers_which_will_not_be_shown_to_User {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        int max = 500;
        int min = 100;
        int count=0;

        System.out.println("Do you want play game ?if yes then enter 1");
        int choice = data.nextInt();
        if (choice==1) {

                System.out.print("Enter your guess number : ");
                int number = data.nextInt();

                for (int i = 1; i <= 10; i++) {

                    //1st random number generate
                    double rand1 = Math.random() * (max - min) + min;
                    int First = (int) Math.floor(rand1);

                    //2nd random number generate
                    double rand2 = Math.random() * (max - min) + min;
                    int Second = (int) Math.floor(rand2);

                    // System.out.println(First);
                   // System.out.println(Second);

                    if (First == number || Second == number) {
                        count += 1;
                    }
                }
                System.out.println("Your total point is " + count);


        }

    }
}
