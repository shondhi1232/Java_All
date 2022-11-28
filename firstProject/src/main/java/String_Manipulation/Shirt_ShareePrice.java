/*
2. Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee, then 400 tk will be discounted.
After your purchase what will be your total cost?
 */
package String_Manipulation;

import java.util.Scanner;

public class Shirt_ShareePrice {
    public static void main(String[] args) {
        Scanner quantity  = new Scanner(System.in);

        String str = "Price of a formal shirt is 1200 tk and Sharee is 3500 tk";

        str = str.replaceAll("[^\\d]"," ");
        str = str.trim();
        str = str.replaceAll(" +"," ");
        String[] array = (str.split(" "));

        double shirt_price = Double.parseDouble(array[0]);
        double share_price = Double.parseDouble(array[1]);
        int total_cost = (int) shirt_price+ (int)share_price;

        int After_Discount_total_cost;



        System.out.println("Enter the quantity that how many shirt you want to purchase : ");
        int Shirt_quantity = quantity.nextInt();
        System.out.println("Enter the quantity that how many sharee you want to purchase : ");
        int Sharee_quantity = quantity.nextInt();

        if (Shirt_quantity ==2 && Sharee_quantity==1){
            After_Discount_total_cost = total_cost - 400;
            System.out.println("total purchase price is : "+After_Discount_total_cost);

        }
        else {
            System.out.println("total purchase price is : "+total_cost);
        }

    }
}
