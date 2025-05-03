import java.util.HashSet;
import java.util.Set;

public class Jay003 {
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "abcd";
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
        boolean first = false;
        int n1 = set.size();
        int n2 = set1.size();
        if(n1>n2){
            first = true;
        }
        if(first){
            for(Character k1 : set){
                if(!set1.contains(k1)){
                    diff++;
                    System.out.println("First :"+diff);
                }
            }
        }else{
            for(Character k1 : set1){
                if(!set.contains(k1)){
                    diff++;
                    System.out.println("Second :"+diff);
                }
            }
        }
        if(diff==k){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
