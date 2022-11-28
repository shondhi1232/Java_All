/*

7. Find out how many images are in the given array:
["photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"]
Output: 3
 */
package String_Manipulation;

import StringPractice.String_Array;

public class Find_Image {
    public static void main(String[] args) {
         String_Array str = new String_Array();

        String image[] ={"photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"};

        int count =0;

        for (int i =0; i<image.length; i++){
            String ch = image[i];
            if (ch.contains(".jpg")|| ch.contains(".png")) {
                count ++;
            }
        }
        System.out.println("Number of vowels in the roadtosdet : " + count);

    }
}
