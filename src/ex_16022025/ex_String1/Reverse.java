package ex_16022025.ex_String1;

public class Reverse {
    public static void main(String[] args) {
        String str = "happy";
        String str2 = "";
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            str2 = c + str2;

        }
        System.out.println(str2);
    }
}
