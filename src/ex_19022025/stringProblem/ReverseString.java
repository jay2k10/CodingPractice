package ex_19022025.stringProblem;

public class ReverseString {
    public static void main(String[] args) {
        String s = "hello friend i live in delhi";
        String str = "";
        char c;

        for (int i = 0; i < s.length(); i++) {
            c= s.charAt(i);

            str = c+str;

        }
        System.out.println(str);
    }
}
