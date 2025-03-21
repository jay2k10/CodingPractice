package _ex23022025._priyankaBatch;

public class ReverseWithoutoneWord1 {

    public static void main(String[] args) {
        String s = "i have class today";
        String result = "";
        String[] s2 = s.split("\s");
        for (int i = 0; i < s2.length; i++) {
            String word = s2[i];
            if (word.equalsIgnoreCase("class")) {
                result = result + " " + word;
            } else {
                result = result + " " + reverse(word);
            }
        }

        System.out.println(result);
    }

    public static String reverse(String s) {
        String s1 = "";
        char c;

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            s1 = c + s1;
        }
        return s1;

    }
}
