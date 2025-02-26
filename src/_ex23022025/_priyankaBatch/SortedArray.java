package _ex23022025._priyankaBatch;

public class SortedArray {
    public static void main(String[] args) {
        int[] a = {10,20,5};
        boolean flag = true;

        for (int i = 0; i < a.length-1; i++) {
                if (a[i] > a[i + 1]) {
                flag = false;
            }

        }
        if (flag == false) {
            System.out.println("Array Not sorted");
        } else {
            System.out.println("Array sorted");
        }
    }
}
