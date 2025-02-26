package ex_19022025.arrayProblem;

public class Max2ndmax {
    public static void main(String[] args) {
        int[] arr = {4,4,4,1,4,8,2,4};
        int max = 0;
        int sMax = 0;

        if(arr.length<2){
            System.out.println("invalid Array");
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                sMax = max;
                max = arr[i];
            }

        }
        System.out.println("First max value is :"+max);
        System.out.println("Second max value is :"+sMax);
    }
}
