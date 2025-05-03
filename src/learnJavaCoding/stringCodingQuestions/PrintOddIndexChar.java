package learnJavaCoding.stringCodingQuestions;

public class PrintOddIndexChar {
    public static void main(String[] args) {
        String s = "automation";
        char c;
        for (int i = 1; i < s.length(); i=i+2) {
            c= s.charAt(i);
            System.out.println("Odd index char is:"+c);

        }
    }
}
