package _ex23022025;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Anagram {
    public static void main(String[] args) {
        String str = "tomato";
        String str1 = "ottamo";

        if(str.length()!=str1.length()){
            System.out.println("Not Anagram !!");
            return;
        }
        Set<Character> set = new LinkedHashSet<>();

        Map<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            set.add(c);
            if (map.containsKey(c)) {

                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }

        }
        Map<Character,Integer> map1 = new LinkedHashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            Character c = str1.charAt(i);
            set.add(c);
            if (map1.containsKey(c)) {

                map1.put(c,map1.get(c)+1);
            }else{
                map1.put(c,1);
            }

        }
        for(Character s:set){
            if(map.get(s)!=map1.get(s)){
                System.out.println("not anagram");
                return;
            }
        }
        System.out.println("Anagram");

    }
}
