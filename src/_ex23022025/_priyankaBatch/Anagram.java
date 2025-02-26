package _ex23022025._priyankaBatch;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        Set<Character> set = new HashSet<>();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            Character c = str1.charAt(i);
            set.add(c);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }

        }
        Map<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < str2.length(); i++) {
            Character c = str2.charAt(i);
            set.add(c);
            if (map1.containsKey(c)) {
                map1.put(c, map1.get(c) + 1);
            } else {
                map1.put(c, 1);
            }
        }
        for(Character c:set){
            if (map.get(c)!=map1.get(c)){
                System.out.println("Not anagram");
                return;
            }
        }
        System.out.println("Anagram!!");
    }
}