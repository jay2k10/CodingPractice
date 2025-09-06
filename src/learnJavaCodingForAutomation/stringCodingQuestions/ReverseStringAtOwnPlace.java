package learnJavaCodingForAutomation.stringCodingQuestions;

public class ReverseStringAtOwnPlace {
    public static void main(String[] args) {
        String s = "i love java";
        String[] s3 = s.split("\s");
        String result = "";
        for (int i = 0; i < s3.length; i++) {
            String word = s3[i];
            result = result + " " + reverseString(word);

        }
        System.out.println("Reverse string at own place is: " + result);

    }

    public static String reverseString(String s) {
        String s2 = "";
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            s2 = c + s2;
        }
        return s2;
    }
}
