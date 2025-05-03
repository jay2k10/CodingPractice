package learnJavaCoding.stringCodingQuestions;

public class CalculateNumericValue1 {
    public static void main(String[] args) {
        String s = "12s s23 f54";
        String removeSpace = "";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                removeSpace = removeSpace + c;
            }

        }
        System.out.println("String after removing space: " + removeSpace);
        for (int i = 0; i < removeSpace.length(); i++) {
            char c = removeSpace.charAt(i);
            if (Character.isDigit(c)) {
                int x = Character.getNumericValue(c);
                sum = sum + x;
            }

        }
        System.out.println("Sum of digit is: " + sum);
    }

}
