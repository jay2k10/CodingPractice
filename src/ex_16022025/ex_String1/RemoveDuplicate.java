package ex_16022025.ex_String1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s = "happy";

        Set<Character> set = new LinkedHashSet();
        for (int i = 0; i < s.length(); i++)
            set.add(s.charAt(i));
            for(Character c :set)
                System.out.println(c);


    }
}
