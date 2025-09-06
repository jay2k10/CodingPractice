package learnJavaCodingForAutomation.stringCodingQuestions;

public class OnlyDigitOrNot {
    public static void main(String[] args) {
        String s = "123s4";
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) {
                flag = false;

            }
        }
        if (flag == true) {
            System.out.println("Contains only digit");

        }
        if (flag == false) {
            System.out.println("Contains digit and alphabet");
        }
    }
}
