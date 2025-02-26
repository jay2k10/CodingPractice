package ex_18022025;

import java.util.HashMap;
import java.util.Map;

public class FindFirstRepeatingChar {
    public static void main(String[] args) {
        String str = "shankarprashad";

        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);

            }else{
                map.put(c,1);
            }

        }
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            if (map.get(c) > 1) {
//                System.out.println("First repeating char :" + c);
//                break;
//            }
//
//        }
        for(Character k:map.keySet()){
            if(map.get(k)>1);
            System.out.println(k +" :"+map.get(k));
        }

        }
    }

