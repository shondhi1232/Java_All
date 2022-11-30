/*
6. Replace "R" from Rahim with "F" from the given String:
Input: Ratul and Rahim lives in Rangpur
Output: Ratul and Fahim lives in Rangpur
 */
package String_Manipulation;

public class String_Replace {
    public static void main(String[] args) {
        String tx = "Ratul and Rahim lives in Rangpur";

        String found = tx.substring(tx.indexOf("Rah"),tx.indexOf("Rah")+5);
        String chng = found.replace('R','F');
       // System.out.println("replace value : "+chng);

        String replace=  tx.replace(found,chng);
        System.out.println("replace value : "+replace);

    }
}
