package _ex07032025;

import java.util.HashMap;
import java.util.Map;

public class OccuranceofInteger {
    public static void main(String[] args) {
        int [] a = {1, 2, 2, 3, 4, 4, 4};
        //Input: [1, 2, 2, 3, 4, 4, 4]

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            Integer j = a[i];

            if(map.containsKey(j)){
                map.put(j, map.get(j)+1);
            }else{
                map.put(j,1);
            }

        }
        for(Integer k : map.keySet()){
            System.out.println(k +" : "+ map.get(k));
        }

    }
}
