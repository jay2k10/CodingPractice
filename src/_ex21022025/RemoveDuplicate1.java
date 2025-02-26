package _ex21022025;

import java.util.ArrayList;

public class RemoveDuplicate1 {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {1, 2, 3, 4, 5};

        ArrayList list = new ArrayList();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {

                if (a[i] == b[j]) {
                    list.add(a[i]);
                }

            }

        }
        System.out.println(list);
    }
}
