package _ex23022025;

import java.util.Arrays;

public class Zerolast {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 0, 3, 4, 5, 6};
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
