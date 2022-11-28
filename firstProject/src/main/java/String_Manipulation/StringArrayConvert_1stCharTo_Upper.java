package String_Manipulation;

public class StringArrayConvert_1stCharTo_Upper {
    public static void main(String[] args) {

        String text = "rahim lives in sylhet";

        String[] Stringarray=text.split(" ");

        for (int i=0;i<Stringarray.length;i++){
            String firstLetter = String.valueOf(Stringarray[i].charAt(0)).toUpperCase();
            String otherLetter = Stringarray[i].substring(1);
            text = firstLetter+otherLetter;
            System.out.println(text);
        }

    }
}
