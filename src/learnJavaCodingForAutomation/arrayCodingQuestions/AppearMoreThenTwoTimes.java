package learnJavaCodingForAutomation.arrayCodingQuestions;

import java.util.HashMap;
import java.util.Map;

public class AppearMoreThenTwoTimes {
    public static void main(String[] args) {
        int[] a = {1, 3, 3, 4, 5, 6, 6, 7, 8, 9, 9};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            Integer j = a[i];
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }
        for (Integer k : map.keySet()) {
            if (map.get(k) > 1) {
                System.out.println(k + " : " + map.get(k));
            }
        }
    }
}
