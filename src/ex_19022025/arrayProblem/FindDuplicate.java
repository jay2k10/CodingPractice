package ex_19022025.arrayProblem;

import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        int [] arr = {1,5,7,2,4,5,7};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);

                }

            }

        }

    }
}
