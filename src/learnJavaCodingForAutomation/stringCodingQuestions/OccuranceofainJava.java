package learnJavaCodingForAutomation.stringCodingQuestions;

public class OccuranceofainJava {
    public static void main(String[] args) {
        String s = "java";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a') {
                count++;
            }

        }
        System.out.println("Occurrence of a in java is: " + count);
    }
}
