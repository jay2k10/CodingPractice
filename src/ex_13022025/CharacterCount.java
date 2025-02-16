package ex_13022025;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "character";
        Map<Character,Integer> map = new LinkedHashMap();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }

        }
        System.out.println(map);
    }
}
