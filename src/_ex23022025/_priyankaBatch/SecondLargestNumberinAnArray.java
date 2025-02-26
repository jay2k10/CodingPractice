package _ex23022025._priyankaBatch;

import java.util.Arrays;

public class SecondLargestNumberinAnArray {
    public static void main(String[] args) {
        int [] arr = {1,2,8,8, 5,10,50 };
        System.out.println(arr.length);

        if(arr.length<2){
            System.out.println("invalid array");
            return;
        }

        Arrays.sort(arr);
        for(int i =arr.length-3;i>=0;i--){
            if(arr[i]!=arr[arr.length-1]){
                System.out.println("The 2nd largest no is "+arr[i]);
                return;
            }

        }
        System.out.println("no 2nd largest no.");
    }
}
