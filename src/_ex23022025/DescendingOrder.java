package _ex23022025;

import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {
        int [] arr = {5,2,6,1,8,9};
        int temp =0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
