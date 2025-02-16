package ex_15012025.collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Flower {
    public static void main(String[] args) {
        List a = new ArrayList();
        a.add("Rose");
        a.add("Lotus");

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));

        }

    }
}
