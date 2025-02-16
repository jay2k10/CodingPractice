package ex_13022025;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class IteratoeEX {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet();
        set.add("Jay");
        set.add("Shree");
        set.add("Ray");
        set.add("Bhat");

        Iterator itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}
