package learnJavaCodingForAutomation.stringCodingQuestions;

public class PalindromeString1 {
    public static void main(String[] args) {
        String s = "naman";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String s1 = sb.toString();
        if (s1.equals(s)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}
