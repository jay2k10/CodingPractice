package ex_16022025.ex_Array;

public class FindDublicate {
    public static void main(String[] args) {
        int[] arr = {10, 3, 6, 7, 1, 1, 9};


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);

                }


            }

        }

    }
}
