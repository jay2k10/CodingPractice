package _ex21022025;

import java.util.Arrays;

public class Zerolast {
    public static void main(String[] args) {
        int [] arr = {1,3,0,4,0,5,7,8};
        System.out.println("Original array is :"+ Arrays.toString(arr));
        int nonZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                arr[nonZero]= arr[i];
                nonZero++;
            }

        }while(nonZero< arr.length){
            arr[nonZero]=0;
            nonZero++;
        }
        System.out.println("Sorted array is :"+ Arrays.toString(arr));
    }
}
