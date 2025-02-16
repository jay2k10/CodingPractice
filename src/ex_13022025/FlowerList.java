package ex_13022025;

import java.util.LinkedList;
import java.util.List;

public class FlowerList {
    public static void main(String[] args) {
        List<String> list = new LinkedList();
        list.add("A");
        list.add("C");
        list.add("D");
        list.add("F");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}
