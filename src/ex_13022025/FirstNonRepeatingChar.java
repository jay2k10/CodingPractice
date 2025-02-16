package ex_13022025;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "character";

        Map<Character, Integer> map = new HashMap();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);

            } else {
                map.put(ch, 1);
            }

        }
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (map.get(c) == 1) {
                System.out.println("First Non-Repeating Char :" + c);
                break;
            }

        }
    }
}
