package ex_18022025;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringAnagram {
    public static void main(String[] args) {
        String str = "tomato";
        String str1 = "tmatoo";

        if (str.length() != str1.length()) {
            System.out.println("String is not an anagram !!");
            return;


        }
        Set<Character> set = new HashSet<>();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            set.add(c);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);


            } else {
                map.put(c, 1);
            }


        }
        Map<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            Character c = str1.charAt(i);
            set.add(c);
            if (map1.containsKey(c)) {
                map1.put(c, map1.get(c) + 1);


            } else {
                map1.put(c, 1);
            }


        }
        for (Character c : set) {
            if (map.get(c) != map1.get(c)) {
                System.out.println("not anagram");
            }

        }
        System.out.println("Anagram!!");

    }
}
