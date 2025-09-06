package learnJavaCodingForAutomation.arrayCodingQuestions;

import java.util.Arrays;

public class SecondHighestNumberwithSortMethod {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 9, 7, 6, 4};

        if (arr.length < 2) {
            System.out.println("Not a valid array length");
            return;
        }
        Arrays.sort(arr);
        System.out.println("After sorting an array: " + Arrays.toString(arr));

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != arr[arr.length - 1]) {
                System.out.println("2nd highest no is: " + arr[i]);
                break;
            }

        }

    }
}
