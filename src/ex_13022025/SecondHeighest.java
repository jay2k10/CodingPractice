package ex_13022025;

import java.util.Arrays;

public class SecondHeighest {
    public static void main(String[] args) {
        int[] arr = {5, 7, 8, 9};
        System.out.println(Arrays.toString(arr));
        int max = 0;
        int sMax =0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                sMax=max;
                max = arr[i];
            }

        }
        System.out.println("Max "+max);
        System.out.println("Second Max "+sMax);
    }
}
