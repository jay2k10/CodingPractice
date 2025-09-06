package learnJavaCodingForAutomation.arrayCodingQuestions;

public class MissingNoinAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int sum = 0;
        int originalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        for (int i = 1; i <= 5; i++) {
            originalSum = originalSum + i;
        }
        int result = originalSum - sum;
        System.out.println("Missing no in an array is: " + result);

    }
}
