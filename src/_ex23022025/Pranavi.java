package _ex23022025;

import java.util.*;

public class Pranavi {
    public static void main(String[] args) {
        String str = "str1025rts";
       Set<Integer> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(Character.isDigit(c)){
                set.add(Character.getNumericValue(c));
            }


        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(list);
        int result = (list.size()-2);
        System.out.println("2nd largest no is :"+result);
    }
}
