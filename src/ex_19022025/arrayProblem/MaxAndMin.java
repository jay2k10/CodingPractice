package ex_19022025.arrayProblem;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 4, 10, 3};
        int max = arr[0];
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
