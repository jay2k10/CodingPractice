package Comparator_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorCoding {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
                list.add(51);
                list.add(18);
                list.add(33);
        Comparator<Integer> com = new Comp();
        ///Collections.sort(list);
        Collections.sort(list,com);
        //System.out.println(list);
        for(Integer k : list ){
            System.out.println(k);
        }
    }
}
