package ex_16022025.ex_Array;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] arr = {5, 10, 25, 56, 1};
        int max = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println("Max :" + max);
        System.out.println("Min :" + min);

    }
}
