package learnJavaCodingForAutomation.stringCodingQuestions;

public class Except_tcs_AllareReversed {
    public static void main(String[] args) {
        String s = "this is a tcs interview";
        String[] s1 = s.split("\s");
        String result = "";
        for (int i = 0; i < s1.length; i++) {
            String word = s1[i];
            if (!word.equalsIgnoreCase("tcs")) {
                result = reverseWord(word) + " " + result;
            } else {
                result = word + " " + result;
            }
        }
        System.out.println(result);
    }

    public static String reverseWord(String s) {
        String result = "";
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            result = c + result;
        }
        return result;
    }
}
