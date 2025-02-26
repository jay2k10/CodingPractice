package ex_18022025;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        String s = "jayshankar";

        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < s.length(); i++)
            set.add(s.charAt(i));
        for (Character c : set) {
            System.out.println(c);
        }

    }
}
