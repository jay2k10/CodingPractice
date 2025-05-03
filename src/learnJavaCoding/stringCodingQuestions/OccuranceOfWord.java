package learnJavaCoding.stringCodingQuestions;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfWord {
    public static void main(String[] args) {
        String s = "Naman is very very good wife";
        String[] s1 = s.split("\s");

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length; i++) {
            String word = s1[i];
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }

        }
        for (String k : map.keySet()) {
            System.out.println(k + ":" + map.get(k));
        }

    }
}
