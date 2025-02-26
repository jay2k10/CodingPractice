package ex_19022025.arrayProblem;

import java.util.Arrays;

public class ZeroFirst {
    public static void main(String[] args) {
        int [] arr = {1,3,0,2,4,5,0,8,0,9};
        int n = arr.length;;
        int nonZero = n-1;

        for (int i = n-1; i >=0; i--) {
            if(arr[i]!=0){
                arr[nonZero]=arr[i];
                nonZero--;
            }

        }while (nonZero>=0){
            arr[nonZero]=0;
            nonZero--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
