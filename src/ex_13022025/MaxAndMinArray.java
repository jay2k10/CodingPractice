package ex_13022025;

import java.util.Arrays;

public class MaxAndMinArray {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 8, 9};
        System.out.println(Arrays.toString(arr));
        int max = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> max){
                max = arr[i];

            }
            if(arr[i]<min){
                min=arr[i];

            }

        }
        System.out.println(max);
        System.out.println(min);
    }
}
