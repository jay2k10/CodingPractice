import java.util.*;

public class Jay001 {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "abce";
        int k = 1;
        int diff = 0;

        Set<Character> set = new HashSet<>();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            Character c = s1.charAt(i);
            set.add(c);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        Map<Character, Integer> map1 = new LinkedHashMap<>();
        for (int i = 0; i < s2.length(); i++) {
            Character c = s2.charAt(i);
            set.add(c);
            if (map1.containsKey(c)) {
                map1.put(c, map1.get(c) + 1);
            } else {
                map1.put(c, 1);
            }
        }
        for(Character k1 : set){
            if(map.get(k1)== map.get(k1)){
                diff++;
                System.out.println(diff);
            }
        }
       if(diff==k){
           System.out.println("true");
       }else{
           System.out.println("false");
       }

    }
}
