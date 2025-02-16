package ex_13022025;

public class ReverseString {
    public static void main(String[] args) {
        String str = "I Live In Delhi";
        System.out.println("Original String :" + str);
        String str1 = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            str1 = ch + str1;

        }
        System.out.println("After Reverse :" + str1);

    }

}
