package ex_19022025.stringProblem;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingChar {
    public static void main(String[] args) {
        String str = "jay shankar";

        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);

            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);

            }else{
                map.put(c,1);
            }

        }
        for (int i = 0; i < str.length(); i++) {
            Character c= str.charAt(i);
            if(map.get(c)>1){
                System.out.println("First repeating character :"+c);
                break;
            }

        }



    }
}
