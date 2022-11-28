/*
4. Writea program that will give following output:
Input: chattogram
Output: C8M

 */

package String_Manipulation;

public class generate_C8M {
    public static void main(String[] args) {

        String str = "chattogram";
        String FirstLetter = String.valueOf(str.charAt(0)).toUpperCase();
        String lastLetter = String.valueOf(str.charAt(str.length()-1)).toUpperCase();

        int len = str.length()-2;

        System.out.print(FirstLetter+len+lastLetter);

    }
}
