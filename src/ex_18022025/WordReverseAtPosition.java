package ex_18022025;

public class WordReverseAtPosition {
    public static void main(String[] args) {
        String str1 = "my name is jay";
        String result = "";
        String[] str3 = str1.split("\s");
        for (int i = 0; i < str3.length; i++) {
            String word = str3[i];

            result = result + " " + reverse(word);

        }
        System.out.println(result);


    }

    public static String reverse(String str1) {
        String str2 = "";
        char c;
        for (int i = 0; i < str1.length(); i++) {
            c = str1.charAt(i);

            str2 = c + str2;

        }
        return str2;

    }
}

