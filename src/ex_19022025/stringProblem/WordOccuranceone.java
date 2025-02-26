package ex_19022025.stringProblem;

import java.util.HashMap;
import java.util.Map;

public class WordOccuranceone {
    public static void main(String[] args) {
        String str = "live in delhi i live in";
        String [] s1 = str.split("\s");

        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length; i++) {
            String s2 = s1[i];

            if(map.containsKey(s2)){
                map.put(s2, map.get(s2)+1);

            }
            else{
                map.put(s2,1);
            }

        }
        for(String k : map.keySet()){
            if(map.get(k)==1){
                System.out.println("Single occurance of word is :"+k);
            }
        }

    }

}
