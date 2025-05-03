package learnJavaCoding.arrayCodingQuestions;

public class CountAndCombinationTarget {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int target = 7;
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == target) {
                    System.out.println("Index of i: " + i + ":" + "index of j: " + j);
                    count++;
                }
            }
        }
        System.out.println("Total count of combination is: " + count);
    }
}
