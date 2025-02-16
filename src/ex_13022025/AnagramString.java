package ex_13022025;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AnagramString {
    public static void main(String[] args) {
        String str1 = "shankar";
        String str2 = "sssshhh";

        if (str1.length() != str2.length()) {
            System.out.println("String is not a Anagram!!");
            return;
        }
        Set<Character> set = new HashSet();

        Map<Character, Integer> map = new HashMap();
        for (int i = 0; i < str1.length(); i++) {
            Character ch = str1.charAt(i);
            set.add(ch);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);

            } else {
                map.put(ch, 1);
            }

        }
        Map<Character, Integer> map1 = new HashMap();
        for (int i = 0; i < str2.length(); i++) {
            Character ch = str2.charAt(i);
            set.add(ch);
            if (map1.containsKey(ch)) {
                map1.put(ch, map1.get(ch) + 1);

            } else {
                map1.put(ch, 1);
            }

        }

        for (Character c : set) {
            System.out.println(c);
            if (map.get(c) != map1.get(c)) {
                System.out.println("String is not a Anagram!!");
                return;
            }


        }
        System.out.println("String is a Anagram!!");


    }

}
