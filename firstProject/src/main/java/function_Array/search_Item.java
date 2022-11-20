/*
4. Create your today's bazaar list/pocket expenditure which includes the item name and price. Then create a function named searchItem(String item) which will be used to search any item from your HashMap and return the price. If found no item, then print message as "No item found" and another function named totalSum() which will return total price of items.

 */

package function_Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class search_Item {

    public static void main(String[] args) {

        Scanner find  = new Scanner(System.in);



        ArrayList bazaarItem = new ArrayList();
        bazaarItem.add("sunflower oil");
        bazaarItem.add("olive oil");
        bazaarItem.add("papaya");
        bazaarItem.add("nuts");
        bazaarItem.add("fruit");
        bazaarItem.add("meat");
        bazaarItem.add("chicken");

        ArrayList price = new ArrayList();

        //hash_list.put(bazaarItem,"sauce");
        //hash_list.get(bazaarItem);



        System.out.println("Enter item name: ");
        String item = find.next();
        System.out.println();


    }


    public static void searchItem(String item){
        HashMap hash_list = new HashMap();



    }
    public int  totalSum(ArrayList bazaar ,int price){
        int total_price=0;
       for (int i=0;i<bazaar.size();i++) {
            total_price +=price;
       }
        return total_price;
    }
}

