import java.util.HashSet;
import java.util.Set;

public class Jay005 {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "abce";
        int k = 1;
        int diff = 0;

        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            Character c = s1.charAt(i);
            set.add(c);

        }
        Set<Character> set1 = new HashSet<>();
        for (int i = 0; i < s2.length(); i++) {
            Character c = s2.charAt(i);
            set1.add(c);

        }
        int n1 = set.size();
        int n2 = set1.size();
        if (n1 > n2) {
            for (Character c1 : set) {
                if (!set1.contains(c1)) {
                    diff++;
                    System.out.println("First:" + diff);
                }
            }
        } else {

            for (Character c2 : set1) {
                if (!set.contains(c2)) {
                    diff++;
                    System.out.println("second:" + diff);
                }
            }
        }
        if (diff <= k) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
