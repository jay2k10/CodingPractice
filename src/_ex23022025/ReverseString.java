package _ex23022025;

public class ReverseString {
    public static void main(String[] args) {
        String str = "To help us make your experience even better";
        String str2 = "";
        char c;

        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            str2 = c+str2;

        }
        System.out.println("Reverse string :"+str2);

    }
}
