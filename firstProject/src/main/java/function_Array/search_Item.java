/*
4. Create your today's bazaar list/pocket expenditure which includes the item name and price. Then create a function named searchItem(String item) which will be used to search any item from your HashMap and return the price. If found no item, then print message as "No item found" and another function named totalSum() which will return total price of items.

 */

package function_Array;

import java.util.HashMap;
import java.util.Scanner;

public class search_Item {

    public static void main(String[] args) {

        Scanner find  = new Scanner(System.in);

        System.out.println("Enter item name: ");
        String item = find.next();
        System.out.println();

        //searchItem method call
        int n = searchItem(item);
        if(n!=0) {
            System.out.println(searchItem(item));
        }
        else {
            System.out.println("No item found");
        }

        // totalSum method call
        System.out.println("Total price of item is :"+totalSum());

    }

    public static HashMap ItemList(){

        HashMap<String, Integer> bazaar_list = new HashMap<String, Integer>();
        bazaar_list.put("sunflower oil",1280);
        bazaar_list.put("olive oil",880);
        bazaar_list.put("papaya",120);
        bazaar_list.put("nuts",200);
        bazaar_list.put("fruit",500);
        bazaar_list.put("meat",600);
        bazaar_list.put("chicken",260);
        return bazaar_list;
    }

    public static int searchItem(String item){
        HashMap bazaar = ItemList();
        int price = 0;
        for (Object key : bazaar.keySet()) {
            if (key.equals(item)) {
                price = (int)bazaar.get(key);

                //return "Item price : " + price + "tk";
            }
        }
        return price;
    }
    public static int  totalSum(){
        HashMap bazaar = ItemList();
        int total_price=0;

        for (Object key : bazaar.keySet()){
            total_price +=(int)bazaar.get(key);

        }
        return total_price;
    }
}

