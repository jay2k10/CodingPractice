package _ex23022025;

public class MaxMin {
    public static void main(String[] args) {
        int [] arr = {1,3,5,7,10,7};
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println(max);
        System.out.println(min);
    }
}
