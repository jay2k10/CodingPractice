package learnJavaCoding.stringCodingQuestions;

public class GenerateSubstring {
    public static void main(String[] args) {
        generateSubString("ABC");

    }
    public static void generateSubString(String s) {
        int size = s.length();
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j <= size; j++) {
                String s1 = s.substring(i, j);
                System.out.println(s1);
            }
        }
    }
}
