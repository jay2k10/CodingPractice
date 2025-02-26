package _ex23022025._priyankaBatch;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurance {
    public static void main(String[] args) {
        String str = "priyanka";

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }

        }
        for(Character k : map.keySet()){
            System.out.println(k +" : "+map.get(k));
        }

    }
}
