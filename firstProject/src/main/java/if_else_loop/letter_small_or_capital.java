/*1. Write a program to check if inputted letter is small or capital

 */

package if_else_loop;

import java.util.Scanner;

public class letter_small_or_capital {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Capital or Small letter:");
         char letter = input.next().charAt(0);

        if(letter >='A' && letter<='Z'){
            System.out.println("The number is Capital letter");
        }
        else if (letter >='a' && letter<='z') {
            System.out.println("The number is Small letter");
            
        }

    }
}
