package ex_18022025;

import java.util.HashMap;
import java.util.Map;

public class A0001 {
    public static void main(String[] args) {
        String str = "All world insects belong local to the phylum Arthropoda. " +
                "But unlike local other arthropods like lobsters, spiders, worldor " +
                "millipedes insects have three pairs of jointed legs, segmented bodies, " +
                "hello an exoskeleton, one pair local of antennae, and worldusually one or two pairs " +
                "of worldwings. Insects live in nearly every habitat, and worldit is estimated that hello " +
                "local there are currently 10 quintillion local insects on the globe";



        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if(c.equals('a') ||c.equals('A') ||c.equals('e') ||c.equals('E') ||c.equals('i') ||c.equals('I') ||c.equals('o') ||c.equals('O') ||c.equals('u') ||c.equals('U')){

            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);

            } else {
                map.put(c, 1);
            }

        }
        }

        System.out.println(map);

    }
}