package StringPractice;

public class StringArray_Trim {
    public static void main(String[] args) {
        String sent = "   hello world     ";

        //length always will be -1 as it's count from 0
        int  sentenceLength = sent.length()-1;
        String trim = sent.trim();
        int length = trim.length()-1 ;

        System.out.println("Array full length is : "+ sentenceLength);
        ///trim cut the before and after or end sentence empty space
        System.out.println("Array After trim : "+trim);
        System.out.println("Array After trim : "+length);

    }
}
