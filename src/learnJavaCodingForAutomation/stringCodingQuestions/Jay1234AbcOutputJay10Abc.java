package learnJavaCodingForAutomation.stringCodingQuestions;

public class Jay1234AbcOutputJay10Abc {
    public static void main(String[] args) {
        String s = "Jay1234Abc";
        StringBuilder sb = new StringBuilder();
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isAlphabetic(c)) {
                if (sum != 0) {
                    sb.append(sum);
                    sum = 0;
                }
                sb.append(c);
            }
            if (Character.isDigit(c)) {
                int x = Character.getNumericValue(c);
                sum = sum + x;
            }
        }
        String s4 = sb.toString();
        System.out.println(s4);
    }
}
