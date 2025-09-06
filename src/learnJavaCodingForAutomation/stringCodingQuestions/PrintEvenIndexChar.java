package learnJavaCodingForAutomation.stringCodingQuestions;

public class PrintEvenIndexChar {
    public static void main(String[] args) {
        String s = "automation";
        char c;
        for (int i = 0; i < s.length(); i=i+2) {
            c= s.charAt(i);
            System.out.println("Even index char is:"+c);

        }
    }
}
