/*
2. Input an amount from the user and find out the number of notes from input amount in given array
[1000,500,100,50,20,10,5,2,1]
Input: 1256
Output:
1000 1
100 2
50 1
2 3

 */

package function_Array;

import java.util.Scanner;

public class find_the_number_of_notes {

    public static void findNote(int[]array,int money){
        int note = 0;
        boolean found = false;

        for( int i=0; i<array.length;i++){

            note = money/array[i];
            money -= note * array[i];
            // found = true;

            if (note==0){
                continue;
            }
            System.out.println(array[i]+" "+note);
        }
    }

    public static void main(String[] args) {

        int array []= {1000,500,100,50,20,10,5,2,1};

        Scanner find  = new Scanner(System.in);

        //find_the_number_of_notes MoneyNumber = new find_the_number_of_notes();

        System.out.println("Enter the amount: ");
        int money = find.nextInt();

        findNote(array,money);

    }


}
