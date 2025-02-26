package ex_19022025.stringProblem;

import java.util.HashMap;
import java.util.Map;

public class DublicateWordCount {
    public static void main(String[] args) {
        String s = "i live in delhi live delhi";
        String [] s1 = s.split("\s");

        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length; i++) {
            String s2 = s1[i];
            if(map.containsKey(s2)){
                map.put(s2,map.get(s2)+1);

            }else{
                map.put(s2,1);
            }

        }
        //System.out.println(map);
        for(String k : map.keySet()){
            if(map.get(k)>1){
                System.out.println("Duplicate word is :"+k);
            }
        }


    }
}
