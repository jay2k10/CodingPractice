package learnJavaCodingForAutomation.arrayCodingQuestions;

import java.util.Arrays;

public class DescendingOrderBubbleSort {
    public static void main(String[] args) {
        int[] a = {6, 8, 11, 6, 7, 18};
        int temp = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Arrays after sorting: "+ Arrays.toString(a));
    }
}