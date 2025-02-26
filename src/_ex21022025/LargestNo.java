package _ex21022025;

public class LargestNo {
    public static void main(String[] args) {
        int max = 0;
        int[] arr = {5, 1, 7, 10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];


            }


        }
        System.out.println(max);
    }
}
