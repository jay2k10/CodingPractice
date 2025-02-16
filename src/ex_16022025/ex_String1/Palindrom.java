package ex_16022025.ex_String1;

public class Palindrom {
    public static void main(String[] args) {
        String s = "Tejaswini";
        StringBuilder s1 = new StringBuilder(s);
        s1.reverse();
        String s2 = s1.toString();
        if (s.equals(s2)) {
            System.out.println("palindrom");
        } else {
            System.out.println("Not a palindrm");
        }


    }
}
