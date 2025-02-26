package _ex23022025;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharCount {
    public static void main(String[] args) {
        String str = "To help us make your experience even better";
        char[] str1 = str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str1.length; i++) {
            Character c = str1[i];

            if (map.containsKey(c)) {

                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }

        }
        //System.out.println(map);
        for (Character k : map.keySet()) {
            if (map.get(k) > 1) {
                System.out.println("Characterkcount :" + k + " " + map.get(k));
            }
        }

    }
}
