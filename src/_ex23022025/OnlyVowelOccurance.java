package _ex23022025;


import java.util.HashMap;
import java.util.Map;

public class OnlyVowelOccurance {
    public static void main(String[] args) {
        String str = "To help us make your experience even better";
        String str1 = str.toLowerCase();

        System.out.println(str1);

        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            Character c = str1.charAt(i);
            if(c.equals('a') ||c.equals('e') ||c.equals('i') ||c.equals('o') ||c.equals('u')){
                if(map.containsKey(c)){
                    map.put(c,map.get(c)+1);

                }else {
                    map.put(c,1);
                }

            }

        }
        System.out.println("Vowel Occurance is :"+map);
    }
}
