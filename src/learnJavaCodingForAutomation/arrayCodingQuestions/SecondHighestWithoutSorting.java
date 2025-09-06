package learnJavaCodingForAutomation.arrayCodingQuestions;

public class SecondHighestWithoutSorting {
    public static void main(String[] args) {


        int[] arr = {1, 5, 3, 7, 9, 4, 2};
        int max = arr[0];
        int sMax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                sMax = max;
                max = arr[i];

            }

        }
        System.out.println("2nd max value is:" + sMax);
    }
}