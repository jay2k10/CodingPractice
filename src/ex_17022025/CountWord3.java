package ex_17022025;

import java.util.HashMap;
import java.util.Map;

public class CountWord3 {
    public static void main(String[] args) {
        String str = "my wife is so beautiful ";
        String[] arr = str.split("\s");

        Map<String, Integer> map = new HashMap<>();
        Integer count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], count+1);

            } else {
                map.put(arr[i],1);
            }

        }
        System.out.println(map);
    }
}
