package ex_19022025.stringProblem;

import java.util.HashMap;
import java.util.Map;

public class OnlyConsonentOccurance {
    public static void main(String[] args) {
        String str = "hello friend how r u";

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (!c.equals('a') && !c.equals('e') && !c.equals('i') && !c.equals('o') && !c.equals('u')) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);

                } else {
                    map.put(c, 1);

                }
            }

        }
        System.out.println("Occurance of Consonent is :" + map);
    }
}
