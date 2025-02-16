package ex_15022025;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "My name is jay shankar";
        // System.out.println(reverse("manish"));

        String[] str2 = str.split("\s");
        String finalWord = "";
        for (int i = 0; i < str2.length; i++) {
            String word = str2[i];

            finalWord = finalWord + " " + reverse(word);

        }
        System.out.println(finalWord);

    }

    public static String reverse(String str) {
        String str2 = "";
        char c;

        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            str2 = c + str2;

        }

        return str2;
    }
}
