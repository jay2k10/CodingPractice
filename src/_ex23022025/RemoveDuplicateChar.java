package _ex23022025;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        String str = "jayshankar";
        char[] ch = str.toCharArray();

        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < ch.length; i++) {
            set.add(ch[i]);

        }
        System.out.println(set);
        for(Character c : set){
            System.out.println(c);

        }
    }
}
