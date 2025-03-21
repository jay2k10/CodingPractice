package Practice;

import java.util.ArrayList;

public class OddFirstEvenLastArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};

        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                odd.add(arr[i]);
            }else{
                even.add(arr[i]);
            }
        }
        ArrayList<Integer> finalArray = new ArrayList<>();
        finalArray.addAll(even);
        finalArray.addAll(odd);
        System.out.println(finalArray);
//        odd.addAll(even);
//        System.out.println(odd);

    }
}
