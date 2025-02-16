package ex_13022025;

import java.util.Arrays;

public class MinAnArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 1, 7, 8, 9};
        System.out.println(Arrays.toString(arr));
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <min){
                min = arr[i];
            }

        }
        System.out.println("Min value is :"+min);
    }
}
