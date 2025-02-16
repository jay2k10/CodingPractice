package ex_16022025.ex_String1;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "naman";
        String str2 = "aamno";

        if(str1.length()!= str2.length()){
            System.out.println("Not a Anagram");
            return;
        }
        Set<Character> set = new LinkedHashSet();

        Map<Character,Integer> map = new HashMap();
        for (int i = 0; i < str1.length(); i++) {
            Character c = str1.charAt(i);
            set.add(c);

            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else {
                map.put(c,1);
            }

        }
        Map<Character,Integer> map1 = new HashMap();
        for (int i = 0; i < str2.length(); i++) {
            Character c = str2.charAt(i);
            set.add(c);

            if(map1.containsKey(c)){
                map1.put(c, map1.get(c)+1);
            }else {
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
