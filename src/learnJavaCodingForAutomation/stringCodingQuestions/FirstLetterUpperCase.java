package learnJavaCodingForAutomation.stringCodingQuestions;

public class FirstLetterUpperCase {
    public static void main(String[] args) {
        String input = "java programming";
        StringBuilder sb = new StringBuilder();
        String[] s = input.split("\s");

        for (int i = 0; i < s.length; i++) {
            String word = s[i];
            sb.append(Character.toUpperCase(word.charAt(0)));
            sb.append(word.substring(1));
            sb.append(" ");
        }
        String output = sb.toString();
        System.out.println("After converting string: " + output);
    }
}
