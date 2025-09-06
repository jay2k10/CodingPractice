package learnJavaCodingForAutomation.stringCodingQuestions;

public class BOOKEEPER {
    public static void main(String[] args) {
        String s = "BOOKEEPER";

        if (s.contains("EE")) {

            int index = s.indexOf("EE");

            if (index != -1) {

                s = s.substring(0, index + 1) + "#" + s.substring(index + 2);
            }
        }
        System.out.println(s);

    }
}
