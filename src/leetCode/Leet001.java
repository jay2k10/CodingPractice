package leetCode;

public class Leet001 {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 6, 10};
        int target = 8;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == 8) {
                    System.out.println("index of i is :" + i + "\n" + "index of j is :" + j);
                }
            }
        }
    }
}
