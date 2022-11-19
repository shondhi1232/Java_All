package Practice;

import java.util.HashMap;

public class My_HashMap {
    
    public static void main(String[] args) {
        //in hash map we can store or keep both string and integer type values
        // but we can only keep for a temporary
        HashMap hashList = new HashMap();
            hashList.put("name","shondhi");
            hashList.put("age",23);
         System.out.println(hashList);
        System.out.println(hashList.get("age"));
    }

}
