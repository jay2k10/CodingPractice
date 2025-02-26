package _ex23022025._priyankaBatch;

import java.util.Arrays;

public class StringSmallCapsDigit {
    public static void main(String[] args) {
        String s = "aBcA1bC2";
        System.out.println(modifyString(s));

    }

    public static String modifyString(String s) {
        StringBuilder lowercase = new StringBuilder();
        StringBuilder uppercase = new StringBuilder();
        StringBuilder digits = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (Character.isLowerCase(c)) {

                lowercase.append(c); //acb

            } else if (Character.isUpperCase(c)) {
                uppercase.append(c); //BAC

            } else if (Character.isDigit(c)) {

                digits.append(c);//312

            }
        }
        //abc
        String sortedLowerCase = SortString(lowercase.toString()); //acb
        //ABC
        String sortedUpperCase = SortString(uppercase.toString());
        //123
        String sortedDigitsCase = SortString(digits.toString());
        return sortedLowerCase + sortedUpperCase + sortedDigitsCase;

        //abc+ABC+123
        //abcABC123

    }

    public static String SortString(String s) {

        char[] b = s.toCharArray(); //acb

        Arrays.sort(b); //abc

        String s1 = new String(b);

        return s1;

    }

}


