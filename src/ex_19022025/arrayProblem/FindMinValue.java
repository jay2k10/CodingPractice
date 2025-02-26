package ex_19022025.arrayProblem;

public class FindMinValue {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 7, 9};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println("Min value is :" + min);
    }
}
