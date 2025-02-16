package ex_13022025;

public class SplitString {
    public static void main(String[] args) {
        String str = "I Live In Delhi";
        System.out.println("Original String :" + str);
        String[] str1 = str.split("\s");
        System.out.println("After Splitting:");
        for (String s : str1) {
            System.out.println(s);
        }
    }
}
