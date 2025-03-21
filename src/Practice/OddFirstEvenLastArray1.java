package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class OddFirstEvenLastArray1 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int index =0;

        int [] newArray = new int [arr.length];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                newArray[index]=arr[i];
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                newArray[index]=arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
