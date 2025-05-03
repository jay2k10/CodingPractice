package learnJavaCoding.arrayCodingQuestions;

import java.util.Arrays;

public class Removeall1andstorerestofelementsinanotherinarray {
    public static void main(String[] args) {

        int[] a = {1, 5, 2, 8, 1, 9, 1};
        int index = 0;
        int remove = 1;
        int[] newArray = new int[a.length - 3];
        for (int i = 0; i < a.length; i++) {
            if (a[i] != remove) {
                newArray[index] = a[i];
                index++;
            }

        }
        System.out.println(Arrays.toString(newArray));

    }
}
