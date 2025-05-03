package learnJavaCoding.stringCodingQuestions;

public class CalculateNumericValue {
    public static void main(String[] args) {
        String s = "123jay4";
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int x = Character.getNumericValue(c);
                sum = sum + x;
            }

        }
        System.out.println("Sum of integer is :" + sum);
    }
}
