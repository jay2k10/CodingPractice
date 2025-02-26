package ex_19022025.arrayProblem;

public class FindMaxValue {
    public static void main(String[] args) {
        int[] arr = {1, 5, 20, 1, 7};

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println("Max value is: "+max);

    }
}
