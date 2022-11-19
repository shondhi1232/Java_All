/*
1. Take input from a user and check if the number exists in the array
let the array is [1,3,5,7,2,4,6,8]
Input: 7
Output: Found in the position 3
Input: 9
Output: Found no element

 */

package function_Array;

import java.util.Scanner;

public class Array_number_exists {
    public static void findArrayNumber(int[] array, int num) {

        boolean found = false;
        int index=0;

        for (int i=0;i<array.length;i++){
            if(array[i]==num) {
                found = true;
                index = i + 1;
            }
        }
        if (found == true) {
            System.out.println(num + " Found in the position : " + index);
        }
        else {
            System.out.println("Found no element ");
        }

    }

        public static void main(String[] args) {
            int array []= {1,3,5,7,2,4,6,8};

        Scanner find  = new Scanner(System.in);

        Array_number_exists ar = new Array_number_exists();

            System.out.println("Enter a number to find element whether it is exits or not in the array: ");
            int num = find.nextInt();

            ar.findArrayNumber(array,num);


        }

}
