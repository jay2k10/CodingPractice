package learnJavaCodingForAutomation.arrayCodingQuestions;

public class SumOfArray {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 9};
        int sum = 0;

        for (Integer k : a) {
            sum = sum + k;
        }
        System.out.println("Sum of all Array element is: " + sum);
    }
}
