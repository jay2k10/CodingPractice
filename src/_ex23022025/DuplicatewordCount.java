package _ex23022025;

import java.util.HashMap;
import java.util.Map;

public class DuplicatewordCount {
    public static void main(String[] args) {
        String str = "To help us make your experience even better help To help ";
        String [] str1 = str.split("\s");

        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < str1.length; i++) {
            String str2 = str1[i];

            if (map.containsKey(str2)) {
                map.put(str2,map.get(str2)+1);

            }else{
                map.put(str2,1);
            }

        }
        //System.out.println(map);
        for(String k: map.keySet()){
            if(map.get(k)>1){
                System.out.println(k +" : "+map.get(k));
            }
        }
    }
}
