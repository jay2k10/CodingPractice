package _ex21022025;

import java.util.Arrays;

public class ZeroFirst {
    public static void main(String[] args) {
        int [] arr = {1,3,0,4,0,5,7,8};
        System.out.println("Original array is :"+ Arrays.toString(arr));
        int n = arr.length;
        int nonZero = n-1;

        for (int i = n-1; i >=0 ; i--) {
            if(arr[i]!=0){
                arr[nonZero]= arr[i];
                nonZero--;
            }

        }while(nonZero>=0){
            arr[nonZero]=0;
            nonZero--;
        }
        System.out.println("Sorted  array is :"+ Arrays.toString(arr));
    }
}
