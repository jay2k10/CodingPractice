package ex_16022025.ex_String;

import java.util.HashMap;
import java.util.Map;

public class EachStringCount {
    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(s);
        String s1 = s.replace(" ", "");
        System.out.println(s1);

        Map<Character, Integer> map = new HashMap();
        for (int i = 0; i < s1.length(); i++) {
            Character c = s1.charAt(i);

            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);

            } else {
                map.put(c, 1);
            }

        }
        System.out.println(map);
    }

}
