package ex_17022025;

import java.util.HashMap;
import java.util.Map;

public class CountWord {
    public static void main(String[] args) {
        String str = "i am learning learning java java program";

        Map<String, Integer> map = new HashMap();
        int count = 1;
        String[] str1 = str.split("\s");
        for (int i = 0; i < str1.length; i++) {
            if (!map.containsKey(str1[i])) {
                map.put(str1[i], count);
            } else {
                map.put(str1[i], map.get(str1[i]) + 1);
            }

        }
        System.out.println(map);
        for (String x : map.keySet()) {
            System.out.println("The count of word :" + x + " = " + map.get(x));
        }
    }
}
