package ex_16022025.ex_String;

public class PalindromString {
    public static void main(String[] args) {
        String s1 = "naman";
        StringBuilder s = new StringBuilder(s1);
        s.reverse();
        String s2 = s.toString();
        if(s1.equals(s2)){
            System.out.println("String is palindrom");
        }else{
            System.out.println("Not a palindrom");
        }

    }
}
