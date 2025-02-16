package ex_16022025.ex_String1;

import java.util.HashMap;
import java.util.Map;

public class StringCount {
    public static void main(String[] args) {
        String s = "happy";

        Map<Character, Integer> map = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);

            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);

            } else {
                map.put(c, 1);
            }

        }
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (map.get(c) > 1) {
                System.out.println(c);
                break;
            }


        }


        System.out.println(map);
    }
}
