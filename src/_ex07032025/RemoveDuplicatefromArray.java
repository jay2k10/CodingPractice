package _ex07032025;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatefromArray {
    public static void main(String[] args) {
        int [] a = {1,2,2,3,4,5,5};
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);

        }
        for(Integer k:set){
            System.out.println(k);
        }
    }
}
