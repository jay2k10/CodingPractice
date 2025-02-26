package _ex23022025._priyankaBatch;

public class ReverseWordAtPosition {
    public static void main(String[] args) {
        String str = "welcome to java";
        String[] str2 = str.split("\s");
        String result = "";

        for (int i = 0; i < str2.length; i++) {
            String word = str2[i];
            result = result + " " + reverse(word);

        }
        System.out.println(result);


    }

    public static String reverse(String str) {
        String str1 = "";
        char c;

        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);

            str1 = c + str1;

        }
        return str1;

    }
}
