import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Jay006 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("a","c");
        for(Map.Entry<String, String> key:map.entrySet()){
            System.out.println(key.getKey()+":"+key.getValue());

        }
        for(String key : map.values()){
            System.out.println("Keys :"+key);
        }
        for(String key : map.keySet()){
            System.out.println("Value :"+key);
        }

    }
}
