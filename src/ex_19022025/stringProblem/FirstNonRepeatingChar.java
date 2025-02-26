package ex_19022025.stringProblem;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s = "hello friend i live in delhi";

        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);

            }else{
                map.put(c,1);
            }

        }
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if(map.get(c)==1){
                System.out.println("First non repeating character :"+c);
                break;
            }

        }
    }
}
