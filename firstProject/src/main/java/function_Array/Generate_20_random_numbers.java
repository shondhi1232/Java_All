/*
7. Generate 20 random numbers from 0 to 100 and print the max, min and duplicate random numbers (if any)
 */

package function_Array;

import java.util.ArrayList;

public class Generate_20_random_numbers {
    public static void main(String[] args) {

        Generate_20_random_numbers maxi = new Generate_20_random_numbers();

        int max = 100;
        int min = 0;
       // boolean values = true;

        //Generating 20 random numbers from 0 to 100
        ArrayList number = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            //1st random number generate
            double rand1 = Math.random() * (max - min) + min;
            int randomNumber = (int) Math.floor(rand1);

            number.add(randomNumber);
            System.out.println(number.get(i));
        }
        //System.out.println("value: "+number.get(5));

       maxi.FindmaxValue(number);
       maxi.FindMin(number);
       maxi.findDuplicateValue(number);


    }

    //--------------------------------------------------------------
         public static int FindmaxValue(ArrayList number){
            int maxValue =(int) number.get(0);

            for (int i = 0; i < number.size(); i++) {
                if ((int)number.get(i) >= maxValue) {
                maxValue= (int) number.get(i);
                }
            }
             System.out.println("Max value is : "+maxValue);
            return maxValue;
    }
    //---------------------------------------------------------------------
         public static int FindMin(ArrayList number){
             //int minValue=Integer.MAX_VALUE;
             int minValue= (int) number.get(0);

             for (int i = 0; i < 20; i++) {
                 if ( minValue ==0){
                     continue;
                 }
                 if ((int)number.get(i) <= minValue) {
                     minValue = (int) number.get(i);
                 }
             }
             System.out.println("Min value is : "+minValue);
            return minValue;
        }
    //---------------------------------------------------------------------
        public static void findDuplicateValue(ArrayList number) {
            for (int i = 0; i < number.size(); i++) {
                for (int j = i + 1; j < number.size(); j++) {
                    if ((int) number.get(i) == (int) number.get(j)) {
                    System.out.println("Duplicate value is : " + number.get(i));
                    }
                }
            }

        }
    }
