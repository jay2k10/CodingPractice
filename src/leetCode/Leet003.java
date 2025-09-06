package leetCode;

import java.util.Arrays;

public class Leet003 {
    public static void main(String[] args) {
        int[] a = {10, 20, 25, 30};
        int i = 0;
        int j = a.length - 1;
        int temp = 0;
        while (i < j) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;

        }
        System.out.println(Arrays.toString(a));
    }
}
