package _ex21022025;

import java.util.Arrays;

public class Ascendingorder {
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 1};
        int temp;


        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

        }
        //System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
