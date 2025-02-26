package _ex23022025;

public class MaxArray {
    public static void main(String[] args) {
        int [] arr = {1,20,15,17,2};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }

        }
        System.out.println(max);
    }
}
