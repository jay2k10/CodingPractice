package _ex23022025._priyankaBatch;

import java.util.Arrays;

public class ThirdLargestNumber {
    public static void main(String[] args) {
        int a [] = {5,6,1,8,9,2};
        System.out.println(a.length);

        if(a.length<3){
            System.out.println("Not a valid array!!");
            return;
        }
        Arrays.sort(a);
        for (int i = a.length-3; i >=0 ; i--) {
            if(a[i]!=a[a.length-1]){
                System.out.println("3nd largest :"+a[i]);
                return;
            }

        }
        System.out.println("no 3nd largest!!");
    }
}
