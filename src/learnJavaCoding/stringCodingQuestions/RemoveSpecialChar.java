package learnJavaCoding.stringCodingQuestions;

public class RemoveSpecialChar {
    public static void main(String[] args) {
        String s = "jat123@!";
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                sb.append(c);
            }
            if (Character.isAlphabetic(c)) {
                sb1.append(c);
            }

        }
        String s3 = sb.toString();
        String s4 = sb1.toString();
        String s5 = s4 + s3;
        System.out.println("After removing special char: " + s5);
    }
}
