package ex_19022025.stringProblem;

import java.util.HashMap;
import java.util.Map;

public class SingleOccuranceChar {
    public static void main(String[] args) {
        String s = "naman";

        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);

            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);

            }else{
                map.put(c,1);
            }

        }
        //System.out.println(map);
        for(Character k : map.keySet()){
            if(map.get(k)==1){
                System.out.println("Single occurance char :"+k);
            }
        }
    }

}
