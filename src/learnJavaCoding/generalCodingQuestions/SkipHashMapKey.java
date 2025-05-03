package learnJavaCoding.generalCodingQuestions;

import java.util.HashMap;
import java.util.Map;

public class SkipHashMapKey {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "Apple");
        map.put("B", "Banana");
        map.put("C", "Cherry");

        String keyToSkip = "B";

        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().equals(keyToSkip)) {
                continue; // Skip this key-value pair
            }
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

