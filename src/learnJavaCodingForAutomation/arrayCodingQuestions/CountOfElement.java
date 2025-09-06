package learnJavaCodingForAutomation.arrayCodingQuestions;

import java.util.HashMap;
import java.util.Map;

public class CountOfElement {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Apple", "Orange", "Banana",
                "Orange", "Orange", "Apple", "Orange", "Grape"};

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < fruits.length; i++) {
            String word = fruits[i];
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
