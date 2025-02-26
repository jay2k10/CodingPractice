package ex_17022025;

import java.util.HashMap;
import java.util.Map;

public class CountWord1 {
    public static void main(String[] args) {
        String s = "may name name jay jay shankar gek of java";
        String[] s1 = s.split("\s");

        Map<String, Integer> map = new HashMap<>();
        int count = 1;
        for (int i = 0; i < s1.length; i++) {
            if (map.containsKey(s1[i])) {
                map.put(s1[i], count+1);
            } else {
                map.put(s1[i], 1);
            }

        }
        System.out.println(map);


    }
}
