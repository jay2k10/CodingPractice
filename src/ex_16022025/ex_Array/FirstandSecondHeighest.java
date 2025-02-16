package ex_16022025.ex_Array;

public class FirstandSecondHeighest {
    public static void main(String[] args) {
        int [] arr = {5,10,25,56,1,};
        int max = 0;
        int sMax =0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                sMax=max;
                max = arr[i];
            }

        }
        System.out.println("Max :"+max);
        System.out.println("sMax :"+sMax);
    }
}
