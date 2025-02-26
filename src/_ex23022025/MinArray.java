package _ex23022025;

public class MinArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 4, 9, 10};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println(min);
    }
}
