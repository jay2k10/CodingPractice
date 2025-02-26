package _ex23022025._priyankaBatch;

import java.util.HashMap;
import java.util.Map;

public class DublicateWord {
    public static void main(String[] args) {
        String str = "Priyanka is a good good trainer";
        String[] arr = str.split("\s");

        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }

        }
       // System.out.println(map);
        for (String k : map.keySet()) {
            if (map.get(k)>1) {
                System.out.println(k + ":" + map.get(k));
            }
        }
    }
}
