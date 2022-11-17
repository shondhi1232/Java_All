/*
5. Write a program to sum of numbers which only divisible by 5 from 1 to 100
 */

package if_else_loop;

public class Only_Divisible_By_5 {
    public static void main(String[] args) {


        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

    }
}
