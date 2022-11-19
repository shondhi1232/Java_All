/*
3. Suppose, in a company , here are some employee salaries in an array
[35000, 25000, 28000, 32500, 44000, 32800]
Find out the 3rd highest salary

 */

package function_Array;

public class Find_3rd_highest_salary {

    public static void main(String[] args) {

        int array []= {35000, 25000, 28000, 32500, 44000, 32800};

        int max =Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int max3rd=0;
        //int search=0;

        for( int i=0; i<array.length;i++){

            if (min==0){
                continue;
            }
            if(array[i]>=max){
                max = array[i];
            }
            if(array[i]<=min){
                min = array[i];
            }
            if(max>array[i] && min<array[i]){
                max3rd = array[i];
            }
        }
        System.out.println(max3rd);
    }

}
