package learnJavaCoding.stringCodingQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "automation";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);

            }
            else {
                map.put(c, 1);
            }

        }
        for (Character k : map.keySet()) {
            if(map.get(k)==1) {
                System.out.println("First non-repeating Character is :" + k);
                break;
            }
        }
    }
}
