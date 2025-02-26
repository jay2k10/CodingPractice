package _ex21022025;

public class MinimumNo {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int[] arr = {3, 4, 5, 7, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println(min);

    }
}
