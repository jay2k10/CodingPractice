package ex_16022025.ex_String;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        String s ="my name is jay";
        System.out.println(s);
        String s1 = s.replace(" ","");
        System.out.println(s1);

        Set<Character>set = new HashSet();
        for (int i = 0; i < s1.length(); i++)
            set.add(s1.charAt(i));
            for(Character c : set)
                System.out.println(c);

    }
}
