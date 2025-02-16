package ex_13022025;

import java.util.Arrays;

public class ShiftZeroLast {
    public static void main(String[] args) {
        int[] arr = {0, 2, 0, 4, 0, 5, 7, 8, 9};
        System.out.println(Arrays.toString(arr));
        int nonZero = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZero] = arr[i];
                nonZero++;

            }
        }
        while (nonZero < arr.length) {
            arr[nonZero] = 0;
            nonZero++;
        }
        System.out.println(Arrays.toString(arr));

    }
}
