/*
4. Create your today's bazaar list/pocket expenditure which includes the item name and price. Then create a function named searchItem(String item) which will be used to search any item from your HashMap and return the price. If found no item, then print message as "No item found" and another function named totalSum() which will return total price of items.

 */

package function_Array;

import java.util.HashMap;
import java.util.Scanner;

public class search_Item {

    public static void main(String[] args) {

        Scanner find  = new Scanner(System.in);

        HashMap bazaar_list = new HashMap();
        bazaar_list.put("sunflower oil",1280);
        bazaar_list.put("olive oil",880);
        bazaar_list.put("papaya",120);
        bazaar_list.put("nuts",200);
        bazaar_list.put("fruit",500);
        bazaar_list.put("meat",600);
        bazaar_list.put("chicken",260);

        System.out.println("Enter item name: ");
        String item = find.next();
        System.out.println();

        searchItem(item);
        //totalSum(bazaar_list,searchItem(item));

    }

    public static int searchItem(String item){
        
        int price = 0;
        return price;
    }
    public static int  totalSum(HashMap bazaar ,int price){
        int total_price=0;
       for (int i=0;i<bazaar.size();i++) {
            total_price +=price;
       }
        return total_price;
    }
}

