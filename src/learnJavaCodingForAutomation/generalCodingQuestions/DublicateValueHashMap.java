package learnJavaCodingForAutomation.generalCodingQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DublicateValueHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap();
        map.put("pt", 1);
        map.put("pt1", 2);
        map.put("pt2", 2);
        map.put("pt3", 4);
        map.put("pt4", 4);
        map.put("pt5", 6);

        Set<Integer> set = new HashSet<>();
        Set<Integer> dublicate = new HashSet<>();

        for(Map.Entry<String, Integer> k : map.entrySet()){
            if(set.contains(k.getValue())){
                dublicate.add(k.getValue());
            }else{
                set.add(k.getValue());
            }
        }
        System.out.println("Dublicate value is: "+dublicate);

    }
}
