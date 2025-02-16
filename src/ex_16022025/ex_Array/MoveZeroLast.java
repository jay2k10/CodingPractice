package ex_16022025.ex_Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveZeroLast {
    public static void main(String[] args) {
        int[] arr = {15, 3, 0, 1, 5, 7, 0, 0, 30};
        int n = arr.length;

        int nonZero = 0;
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[nonZero]= arr[i];
                nonZero++;
            }

        }
        while(nonZero< arr.length){
            arr[nonZero] = 0;
            nonZero++;

        }
        System.out.println(Arrays.toString(arr));


    }
}
