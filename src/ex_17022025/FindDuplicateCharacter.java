package ex_17022025;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacter {
    public static void main(String[] args) {
        String s = "laptop";
        char [] s1 = s.toCharArray();

        Map<Character,Integer> map = new HashMap<>();
        int count = 1;
        for (int i = 0; i < s1.length; i++) {
            if(!map.containsKey(s1[i])){
                map.put(s1[i],count);

            }else{
                map.put(s1[i], map.get(s1[i])+1);
            }

        }
        System.out.println(map);
    }
}
