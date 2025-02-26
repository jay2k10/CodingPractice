package ex_17022025;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
    public static void main(String[] args) {
        String s1 = "may name name jay jay shankar gek of java";
        System.out.println(s1);
        String s2 = s1.replace(" ", "");
        System.out.println(s2);

        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s2.length(); i++) {
            Character c = s2.charAt(i);

            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }

        }
        for (int i = 0; i < s2.length(); i++) {
            Character c = s2.charAt(i);
            if(map.get(c)==1){
                System.out.println(c);
                break;

            }

        }
        System.out.println(map);
    }
}
