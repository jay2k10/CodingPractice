package _ex23022025;

public class MaxSmax {
    public static void main(String[] args) {
        int [] arr = {4,1,6,7,2};
        int max = 0;
        int sMax = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                sMax=max;
                max = arr[i];
            }

        }
        System.out.println("Max: "+max);
        System.out.println("S max: "+sMax);
    }
}
