package ex_16022025.ex_String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstRepeatingChar {
    public static void main(String[] args) {
        String s = "jai shree ram";
        System.out.println("Old String :" + s);
        String s1 = s.replace(" ", "");
        System.out.println("New String :" + s1);

//        Map<Character, Integer> map = new HashMap();
//        for (int i = 0; i < s1.length(); i++) {
//            Character c = s1.charAt(i);
//            if (map.containsKey(c)) {
//                map.put(c, map.get(c) + 1);
//
//            } else {
//                map.put(c, 1);
//            }
//        }
//        for (int i = 0; i < s1.length(); i++) {
//            Character c = s1.charAt(i);
//            if (map.get(c) > 1) {
//                System.out.println("First repeating character is: " + c);
//                break;
//
//            }
//
//        }
//        System.out.println(map);

        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            if(set.contains(s1.charAt(i))){
                System.out.println(s1.charAt(i));
                break;

            }
            set.add(s1.charAt(i));


        }

    }
}
