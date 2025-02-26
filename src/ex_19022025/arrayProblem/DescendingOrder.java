package ex_19022025.arrayProblem;

import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
