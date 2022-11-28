/*
5. Write a program that will count how many vowels in the given string:
"roadtosdet"
 */
package String_Manipulation;

public class Vowel_Count {
    public static void main(String[] args) {

        String text ="roadtosdet" ;
        char array [] = text.toCharArray();

        int count =0;

        for (int i =0; i<array.length; i++){
            char ch = array[i];
            if (ch=='a'|| ch=='e'|| ch=='i' || ch=='o'|| ch=='u') {
                 count ++;
            }
        }
        System.out.println("Number of vowels in the roadtosdet : " + count);


    }
}
