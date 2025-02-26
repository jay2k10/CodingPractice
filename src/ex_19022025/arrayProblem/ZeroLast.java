package ex_19022025.arrayProblem;

import java.util.Arrays;

public class ZeroLast {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 5, 0, 9};
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
