/*
5. Take 5 numbers from users in an array. Then find out the average number, how many even and how many odd numbers using these functions: average(), countEvenNumbers(), countOddNumbers()
 */

package function_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Odd_Even_Average {
    public static void main(String[] args) {
        Scanner cal  = new Scanner(System.in);

        ArrayList number = new ArrayList<>();

        for (int i =0;i<5;i++) {

            System.out.println((i+1)+". Enter your number: ");
            int UserNumber = cal.nextInt();
            number.add(UserNumber);
        }
        System.out.println(number);

   //--------------//average----------//
        int ave = average(number);
        System.out.println("Average : "+ave);

        //Even number method call
        countEvenNumbers(number);

        //Odd number method call
        countOddNumbers(number);
    }
    public static int average(ArrayList num){
        int sum =0;
        int Average = 0;
        for (int i =0;i<5;i++) {
            sum += (int)num.get(i);
        }
        Average += sum/ num.size();
        return Average;
    }
 //---------------------------------------------------------------
    public static void countEvenNumbers(ArrayList num){
        int even =0;
        for (int i =0;i<5;i++) {
            if ((int) num.get(i)%2==0) {
                even = (int) num.get(i);
                System.out.println("Even Number : "+even);
            }
        }
    }
 //---------------------------------------------------------------
        public static void countOddNumbers(ArrayList num) {
            int odd = 0;
            for (int i = 0; i < 5; i++) {
                if ((int) num.get(i) % 2 != 0) {
                    odd = (int) num.get(i);
                    System.out.println("Odd Number : "+odd);
                }
            }
        }



}
