package _ex07032025;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 6};

        int i = 0;
        int j = a.length - 1;
        int temp = 0;

        while (i < j) {  // 0<4
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;

        }
        System.out.println(Arrays.toString(a));
    }
}
