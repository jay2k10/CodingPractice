package learnJavaCodingForAutomation.stringCodingQuestions;

public class TotalCharVowelConsonent {
    public static void main(String[] args) {
        String s = "my name is jay";
        int totalChar = 0;
        int totalVowel = 0;
        int totalCons = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                totalChar++;
            }
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                totalVowel++;

            }
            else if (c > 'a' && c <= 'z') {
                totalCons++;
            }

        }
        System.out.println("Total character is :" + totalChar);
        System.out.println("Total vowel is :" + totalVowel);
        System.out.println("Total Consonant is :" + totalCons);
    }
}
