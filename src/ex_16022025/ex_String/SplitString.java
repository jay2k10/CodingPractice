package ex_16022025.ex_String;

import java.util.Arrays;

public class SplitString {
    public static void main(String[] args) {
        String str = "my name is Pranavi Rani";
        String[] str1 = str.split(" ");
        //System.out.println(Arrays.stream(str1).toList());
        for (String s : str1) {
            System.out.println(s);
        }
    }
}
