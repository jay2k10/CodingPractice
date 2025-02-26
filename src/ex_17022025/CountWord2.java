package ex_17022025;

import java.util.HashMap;
import java.util.Map;

public class CountWord2 {
    public static void main(String[] args) {
        String s = "jay shankar prasad";
        String[] arr = s.split("\s");
        for (String s1 : arr) {
            System.out.println(s1);
        }
        Map<String, Integer> map = new HashMap<>();
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], count);

            } else {
                map.put(arr[i], map.get(arr[i]) + 1);

            }

        }
        System.out.println(map);

    }
}
