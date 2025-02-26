package _ex23022025;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateWord {
    public static void main(String[] args) {
        String str = "my name is jay jay is";
        String [] str1 = str.split("\s");

        Set<String> set = new HashSet<>();
        for (int i = 0; i < str1.length; i++) {
            set.add(str1[i]);

        }
        System.out.println(set);
        for(String s :set){
            System.out.println(s);
        }
    }
}
