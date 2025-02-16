package ex_16022025.ex_Array;

import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {
        int[] arr = {5, 10, 2, 1, 4, 3};
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
