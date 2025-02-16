package ex_16022025.ex_Array;

import java.util.Arrays;

public class ZeroLast {
    public static void main(String[] args) {
        int arr[] = {0, 1, 4, 0, 7, 8, 0, 9, 6};
        int n = arr.length;
        ;
        int nonZero = 0;
        System.out.println(Arrays.toString(arr));

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
