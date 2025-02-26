package ex_17022025;

import java.util.Arrays;

public class MissingnoAnArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 7, 8, 9};
        int sum = 0;
        int expsum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum= sum+arr[i];

        }
        for (int i = 1; i <=9; i++) {
            expsum = expsum+i;

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("missing no :" +(expsum-sum));
    }
}
