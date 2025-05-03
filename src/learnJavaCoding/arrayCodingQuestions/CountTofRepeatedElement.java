package learnJavaCoding.arrayCodingQuestions;

import java.util.HashMap;
import java.util.Map;

public class CountTofRepeatedElement {
    public static void main(String[] args) {
        int[] arr = {4, 4, 1, 3, 3, 2, 5, 5};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            Integer j = arr[i];
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }

        }
        //System.out.println(map);
        for(Integer k : map.keySet()){
            if(map.get(k)>1){
                System.out.println(k+ " : "+map.get(k));
            }
        }
    }
}
