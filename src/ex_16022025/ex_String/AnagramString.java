package ex_16022025.ex_String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AnagramString {
    public static void main(String[] args) {
        String s1 = "tomatoo";
        String s2 = "omatotz";

        if(s1.length()!=s2.length()){
            System.out.println("Not a Anagram");
            return;
        }
        Set<Character> set = new HashSet();

        Map<Character,Integer> map = new HashMap();
        for (int i = 0; i < s1.length(); i++) {
            Character c = s1.charAt(i);
            set.add(c);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c,1);
            }

        }
        Map<Character,Integer> map1 = new HashMap();
        for (int i = 0; i < s2.length(); i++) {
            Character c = s2.charAt(i);
            set.add(c);
            if(map1.containsKey(c)){
                map1.put(c, map1.get(c)+1);
            }else{
                map1.put(c,1);
            }

        }
        for(Character c :set){
            //System.out.println(c);
            if(map.containsKey(c)!=map1.containsKey(c)){
                System.out.println("not anagram!!");
                return;
            }
        }
        System.out.println("Anagram");
    }
}
