package _ex21022025;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 9};
        int b[] = {1, 2, 8, 4, 9};

        HashSet set = new HashSet();

        for (int i : a) {
            set.add(i);

        }
        HashSet set1 = new HashSet();
        for (int j : b) {
            if (set.contains(j)) {
                set1.add(j);
            }
        }
        System.out.println(set1);


    }
}
