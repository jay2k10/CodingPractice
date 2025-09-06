package learnJavaCodingForAutomation.arrayCodingQuestions;

import java.util.Arrays;

public class DeleteAnElement {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int delete = 3;
        int index = 0;

        int[] newArray = new int[a.length - 1];
        for (int i = 0; i < a.length; i++) {
            if (a[i] != delete) {
                newArray[index] = a[i];
                index++;
            }
        }
        System.out.println("New Array is: " + Arrays.toString(newArray));
    }
}
