package ex_19022025.stringProblem;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        String s = "Pranavi";

        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < s.length(); i++)
            set.add(s.charAt(i));
        for(Character c:set){
            System.out.println(c);
        }



    }
}
