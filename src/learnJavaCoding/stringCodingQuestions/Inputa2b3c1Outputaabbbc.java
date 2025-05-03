package learnJavaCoding.stringCodingQuestions;

public class Inputa2b3c1Outputaabbbc {
    public static void main(String[] args) {
        String s = "a2b3c1";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isAlphabetic(c)) {
                System.out.print(c);
            } else {
                int x = Character.getNumericValue(s.charAt(i));
                for (int j = 1; j < x; j++) {
                    System.out.print(s.charAt(i - 1));

                }
            }

        }
    }
}
