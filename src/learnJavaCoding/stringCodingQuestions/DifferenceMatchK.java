package learnJavaCoding.stringCodingQuestions;

import java.util.HashSet;
import java.util.Set;

public class DifferenceMatchK {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "aebf";
        int diff = 0;
        int k = 1;
        Set<Character> set = new HashSet<>();
        Set<Character> set1 = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            Character c = s1.charAt(i);
            set.add(c);
        }
        for (int i = 0; i < s2.length(); i++) {
            Character c = s2.charAt(i);
            set1.add(c);
        }
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1 > n2) {
            for (Character c1 : set) {
                if (!set1.contains(c1)) {
                    diff++;
                }
            }
        } else {
            for (Character c2 : set1) {
                if (!set.contains(c2)) {
                    diff++;
                }
            }
        }
        if (diff == k) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
