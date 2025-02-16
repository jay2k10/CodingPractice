package ex_15022025;

import java.util.*;

public class CheckAnagramString {
    public static void main(String[] args) {
        String str1 = "shankar";
        String str2 = "ssshhhh";
        if (str1.length() != str2.length()) {
            System.out.println("String is not Anagram !");
            return;

        }
        Set<Character> set = new LinkedHashSet();
        Map<Character, Integer> map = new LinkedHashMap();

        for (int i = 0; i < str1.length(); i++) {
            Character c = str1.charAt(i);
            if (map.containsKey(c)) {
                set.add(c);
                map.put(c, map.get(c) + 1);

            } else {
                map.put(c, 1);
            }

        }
        Map<Character, Integer> map1 = new LinkedHashMap();
        for (int i = 0; i < str2.length(); i++) {
            Character c1 = str2.charAt(i);
            if (map1.containsKey(c1)) {
                set.add(c1);
                map1.put(c1, map1.get(c1) + 1);

            } else {
                map1.put(c1, 1);
            }

        }
        for (Character c : set) {
            System.out.println(c);
            if (map.get(c) != map1.get(c)) {
                System.out.println("String is not anagram!!");
                return;
            }

        }
        System.out.println("String is anagram!!");
    }
}
