/*
8. Write a program to convert each 1st char to uppercase from a string
Input: rahim lives in sylhet
Output: Rahim Lives in Sylhet
 */
package Practice;

public class Convert_1st_char_to_Uppercase {
    public static void main(String[] args) {

        String text = "rahim lives in sylhet";

        char[] charArray = text.toCharArray();

        boolean found =true;

        for (int i=0;i<charArray.length;i++){

            if(Character.isLetter(charArray[i])) {
                if(found) {

                    charArray[i] = Character.toUpperCase(charArray[i]);
                    found = false;
                }
            }
            else {
                found = true;
            }
        }
        text = String.valueOf(charArray);
        System.out.println("Message: " + text);
    }
}
