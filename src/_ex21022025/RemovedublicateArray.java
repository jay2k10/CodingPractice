package _ex21022025;

import java.util.HashSet;
import java.util.Set;

public class RemovedublicateArray {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 3, 5, 8};

        Set set = new HashSet();

        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
            //if(set.add(a[i])==true){
                //System.out.println(a[i]);

            //}

        }
        System.out.println(set);
    }
}
