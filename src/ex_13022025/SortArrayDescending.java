package ex_13022025;

import java.util.Arrays;

public class SortArrayDescending {
    public static void main(String[] args) {
        int[] arr = {10, 15, 2, 1, 9, 22};
        System.out.println(Arrays.toString(arr));
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;

                }

            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
