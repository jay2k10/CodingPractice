package ex_18022025;

public class ReverseString {
    public static void main(String[] args) {
        String s = "jay shankar";
        String s1 = "";
        char c;

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            s1 = c+s1;

        }
        System.out.println(s1);
    }
}
