package Practice;

import java.util.ArrayList;

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] a = {2, 7, 1};
        int[] b = {3, 8, 2};

        int[] merge = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            merge[i] = a[i];
        }
        for (int j = 0; j < b.length; j++) {
            merge[a.length + j] = b[j];

        }
        ArrayList list = new ArrayList();
        for (Integer k : merge) {
            list.add(k);
        }
        System.out.println(list);


    }
}
