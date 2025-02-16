package ex_13022025;

import java.util.Arrays;

public class MaxAnArray {
    public static void main(String[] args) {
        int[] arr = {0, 2, 0, 4, 0, 5, 7, 8, 9};
        System.out.println(Arrays.toString(arr));
        int max =0;
        for (int i =0;i< arr.length;i++){
            if(arr[i]>max){
                max =arr[i];
            }
        }
        System.out.println("max value is :"+max);
    }
}
