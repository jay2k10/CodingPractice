package _ex23022025;

import java.util.HashMap;
import java.util.TreeMap;

public class Tuesday {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("jay","shankar");
        map.put("ram","shyam");
        map.put(null,"surrender");

        //map.put("null","null2");
        //map.get("rahul");

//        HashMap map1 = new HashMap();
//        map.put("jay","shankar");
//        map.put("ram","shyam");

       for(Object key : map.keySet()){
           System.out.println(key);

       }
        System.out.println("----------------------------");
       for(Object value : map.values()){
           System.out.println(value);
       }
        System.out.println("-------------------------");
       for(Object key : map.entrySet()){
           System.out.println(key);
       }
    }
}
