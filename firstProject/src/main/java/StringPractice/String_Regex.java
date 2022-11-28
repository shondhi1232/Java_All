package StringPractice;

public class String_Regex {
    public static void main(String[] args) {

        String str = "The price of the shirt is 500 tk and VAT is 75 tk will be added";

        //replacing all chars into empty space
        //  ^ this means not
        //  \\d means in string digit
        // "[^\\d]" , " " means in an array all char will replace by empty space except digits
        str = str.replaceAll("[^\\d]"," ");
        str = str.trim();

        //" +"," " means empty space will concate with next empty space
        // this way we will have only one empty space between string digit
        str = str.replaceAll(" +"," ");

        //when we will find empty space it wll split
        String[] array = (str.split(" "));

        //converting strings digit into integer value
        double shirt_price = Double.parseDouble(array[0]);
        double vat = Double.parseDouble(array[1]);
        double total_priceOf_Shirt = shirt_price+vat;
        System.out.println("Total of shirt is : "+total_priceOf_Shirt);

    }
}
