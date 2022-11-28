package StringPractice;

public class Generate_B8H {
    public static void main(String[] args) {
        String str = "bangladesh";
        String FirstLetter = String.valueOf(str.charAt(0)).toUpperCase();
        String lastLetter = String.valueOf(str.charAt(str.length()-1)).toUpperCase();

        int len = str.length()-2;

        System.out.print(FirstLetter+len+lastLetter);
    }
}
