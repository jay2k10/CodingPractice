import java.util.HashMap;
import java.util.Map;

public class Gspn02 {
    public static void main(String[] args) {

        String s = "jayshankar";

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }

        }
        for (Character k : map.keySet()) {
            System.out.println(k + ":" + map.get(k));
        }

    }
}