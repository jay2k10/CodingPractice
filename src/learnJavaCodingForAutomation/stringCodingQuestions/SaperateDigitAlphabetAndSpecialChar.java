package learnJavaCodingForAutomation.stringCodingQuestions;

public class SaperateDigitAlphabetAndSpecialChar {
    public static void main(String[] args) {
        String s = "jay123@!";
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isAlphabetic(c)) {
                sb.append(c);
            } else if (Character.isDigit(c)) {
                sb1.append(c);

            } else {
                sb2.append(c);
            }
        }
        String Alphabet = sb.toString();
        String Digit = sb1.toString();
        String Special = sb2.toString();
        System.out.println("Alphabet is: " + Alphabet);
        System.out.println("Digit is: " + Digit);
        System.out.println("Special char is: " + Special);
    }
}
