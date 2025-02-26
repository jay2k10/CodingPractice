package _ex21022025;

public class Large2ndlargest {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 1, 9};
        int max = 0;
        int slar = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                slar = max;
                max = arr[i];
            }

        }
        System.out.println(max);
        System.out.println(slar);
    }
}
