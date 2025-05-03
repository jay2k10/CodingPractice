package learnJavaCoding.stringCodingQuestions;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccuranceMorethenOneTime {
    public static void main(String[] args) {
        String s = "automation";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);

            } else {
                map.put(c, 1);
            }

        }
        for (Character k : map.keySet()) {
            if(map.get(k)>1)
            System.out.println(k + ":" + map.get(k));
        }
    }
}
