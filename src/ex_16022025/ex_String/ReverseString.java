package ex_16022025.ex_String;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Birendra";
        String str1 = "";
        char c;

        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            str1 = c + str1;

        }
        System.out.println(str1);
    }
}
