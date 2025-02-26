package _ex21022025;

public class LargeSmall {
    public static void main(String[] args) {
        int arr[] = {5, 2, 9, 10};
        int max = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
            else if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println(max);
        System.out.println(min);

    }

}
