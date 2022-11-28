/*
3. Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?
 */

package String_Manipulation;

public class Laptop_PurchasePrice {
    public static void main(String[] args) {

        String str = "core i7 HP laptop price is 76000 tk and cash payment discount 10%";

        str = str.replaceAll("[^\\d]"," ");
        str = str.replace("7 ","s");
        str = str.replaceAll("[^\\d]"," ");
        str = str.trim();
        //System.out.println(str);
        str = str.replaceAll(" +"," ");
        //System.out.println(str);
        String[] array = (str.split(" "));

        double laptop_price = Double.parseDouble(array[0]);
        double discount = (Double.parseDouble(array[1]))/100;
        double discount_priceOf_laptop = laptop_price * discount;

        int Purchase_price= (int)laptop_price - (int) discount_priceOf_laptop;
        System.out.println("In cash payment, after 10% discount Laptop Purchase price is : "+Purchase_price);

    }
}
