package learnJavaCoding.stringCodingQuestions;

public class EliminatingVowel {
    public static void main(String[] args) {
        String s = "i am the interviewer";
        String s1 = "";
        char c;

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                s1 = s1 + c;

            }
        }
        System.out.println("String after eliminating vowels: " + s1);
    }
}
