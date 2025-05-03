package learnJavaCoding.arrayCodingQuestions;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        int[] a = {1, 3, 8, 5, 9};
        boolean b = true;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    b = false;
                }
            }
        }
        if (b == true) {
            System.out.println("Array is sorted");
        }
        if (b == false) {
            System.out.println("Array is not sorted");
        }
    }
}
