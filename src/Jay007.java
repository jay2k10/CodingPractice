import java.util.HashMap;
import java.util.HashSet;

public class Jay007 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "A");
        map.put("b", "B");
        map.put("c", "C");

        HashMap<String, String> map1 = new HashMap<>();
        map1.put("a", "A");
        map1.put("b", "B");
        map1.put("c", "C");
        map1.put("d", "D");

        System.out.println(map.keySet().equals(map1.keySet()));

        HashSet set = new HashSet<>(map.keySet()); //abc
        set.addAll(map1.keySet()); //abcd
        System.out.println("add All :" + set);
        set.removeAll(map.keySet()); //d
        System.out.println("After remove :" + set);


    }
}
