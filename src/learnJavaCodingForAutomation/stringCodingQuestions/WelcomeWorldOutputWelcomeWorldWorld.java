package learnJavaCodingForAutomation.stringCodingQuestions;

public class WelcomeWorldOutputWelcomeWorldWorld {
    public static void main(String[] args) {
        String s = "Welcome World";
        String s2 = "";
        String[] s1 = s.split("\s");
        for (int i = 1; i < s1.length; i++) {
            String word = s1[i];
            s2 = s2 + word;

        }
        String result = s + " " + s2;
        System.out.println("Output String is: " + result);
    }

}
