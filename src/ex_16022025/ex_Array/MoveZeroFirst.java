package ex_16022025.ex_Array;

import java.util.Arrays;

public class MoveZeroFirst {
    public static void main(String[] args) {
        int[] arr = {15, 3, 0, 1, 5, 7, 0, 0, 30};
        int n = arr.length;
        int nonZero = n-1;
        System.out.println(Arrays.toString(arr));

        for (int i = n-1; i >=0 ; i--) {
            if(arr[i]!=0){
                arr[nonZero]=arr[i];
                nonZero--;
            }

        }
        while(nonZero>=0){
            arr[nonZero]=0;
            nonZero--;
        }
        System.out.println(Arrays.toString(arr));



    }
}
