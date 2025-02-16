package ex_15012025.collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Coll001 {
    public static void main(String[] args) {
        List a = new ArrayList();
        a.add("jay");
        a.add("shankar");
        a.add("prasad");
        a.add(1);
        System.out.println(a.size());
        System.out.println(a.getFirst());
        System.out.println(a.getLast());
    }
}
