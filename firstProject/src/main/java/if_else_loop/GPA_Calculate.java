/*
2. Write a program to calculate GPA and find grade

 */

package if_else_loop;

import java.util.Scanner;

public class GPA_Calculate {
    public static void main(String[] args) {

        System.out.println("//'GPA calculating'//");

        int i;
        int sum=0;

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your Total subjects number:");
        int numberOfTotalSub = input.nextInt();


        System.out.println("Please enter your marks of "+numberOfTotalSub+" subjects: ");
        for(i=0; i<numberOfTotalSub; i++){
            sum+= input.nextInt();
        }
        System.out.println("Total MArks : " + sum);


        int result1 = sum/numberOfTotalSub;

        if((result1>=80) && (result1<=100)){
            System.out.println("Your GPA is 5.00 and grade is: A+");
        }
        else if((result1>=75) && (result1<=79)){
            System.out.println("Your GPA is 4.00 and grade is: A");

        }
        else if((result1>=70) && (result1<=74)) {
            System.out.println("Your GPA is 3.50 and grade is: A-");

        }
        else if((result1>=65) && (result1<=69)) {
            System.out.println("Your GPA is 3.25 and grade is: B+");

        }
        else if((result1>=60) && (result1<=64)) {
            System.out.println("your GPA is 3.00 and grade is: B");

        }
        else if((result1>=55) && (result1<=59)) {
            System.out.println("Your GPA is 2.75 and grade is: B-");

        }
        else if((result1>=50) && (result1<=54)) {
            System.out.println("Your GPA is 2.50 and grade is: C+");

        }
        else if((result1>=45) && (result1<=49)) {
            System.out.println("Your GPA is 2.25 and grade is: C");

        }
        else if((result1>=40) && (result1<=44)) {
                System.out.println("Your GPA is 2.00 and grade is: D");

        }
        else {
            System.out.println("Your GPA is 0.00 and grade is: F");

        }

        System.out.println("Your total average marks is: "+result1);
    }
}
