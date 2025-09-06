package learnJavaCodingForAutomation.stringCodingQuestions;

public class AllLetterUpperCaseExceptFirst {
    public static void main(String[] args) {
        String input = "Java Programming";
        StringBuilder sb = new StringBuilder();
        String[] s = input.split("\s");

        for (int i = 0; i < s.length; i++) {
            String word = s[i];
            sb.append(Character.toLowerCase(word.charAt(0)));
            sb.append(word.substring(1).toUpperCase());
            sb.append(" ");
        }
        String output = sb.toString();
        System.out.println("String output is: " + output);
    }
}
