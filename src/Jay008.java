import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.HashSet;

public class Jay008 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("a", "a");
        map.put("b", "b");
        map.put("c", "c");
        map.put("d", "d");
        HashMap map1 = new HashMap();
        map1.put("a", "a");
        map1.put("b", "b");
        map1.put("c", "c");
        map1.put("e", "e");
        HashSet unCommonKeys = new HashSet(map.keySet());
        unCommonKeys.addAll(map1.keySet());
        System.out.println("Uncommon Keys :" + unCommonKeys);
        HashSet commonKeys = new HashSet(map.keySet());
        commonKeys.retainAll(map1.keySet());
        System.out.println("Common Keys :" + commonKeys);
        unCommonKeys.removeAll(commonKeys);
        System.out.println(unCommonKeys);
    }
}
