package ex_16022025.ex_Array;

import java.util.Arrays;

public class FindMin {
    public static void main(String[] args) {
        int [] arr = {5,10,25,56,1};
        int min = Integer.MAX_VALUE;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min= arr[i];
            }

        }
        System.out.println(min);
    }
}
