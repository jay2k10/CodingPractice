import java.util.HashMap;

public class Jay009 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("hey", "good");
        map.put("testing", "test");

        map.remove("hey");
        map.containsKey("testing");
        System.out.println(map);
        System.out.println("After removing first Key and Value:"+map);

    }
}
