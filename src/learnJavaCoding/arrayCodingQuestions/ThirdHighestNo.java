package learnJavaCoding.arrayCodingQuestions;

import java.util.Arrays;

public class ThirdHighestNo {
    public static void main(String[] args) {
        int a[] = {1, 7, 3, 9, 4};
        if (a.length < 3) {
            System.out.println("Not a valid array length");
            return;
        }
        Arrays.sort(a);
        System.out.println("Sorted array is: " + Arrays.toString(a));
        for (int i = a.length - 2; i >= 0; i--) {
            if (a[i] != a[a.length - 2]) {
                System.out.println("3rd Highest no is: " + a[i]);
                break;
            }
        }
    }
}
