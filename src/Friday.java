import java.util.*;

public class Friday {
    public static void main(String[] args) {
        HashMap<String, Integer> newobj = new HashMap();
        newobj.put("pt", 1);

        newobj.put("pt1", 2);

        newobj.put("pt2", 2);

        newobj.put("pt3", 4);

        newobj.put("pt4", 4);

        newobj.put("pt5", 6);
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();


//        for (Integer k : newobj.values()) {
//            if (set.contains(k.intValue())) {
//                duplicate.add(k.intValue());
//            } else {
//                set.add(k.intValue());
//            }
//        }
        for (Map.Entry<String, Integer> k : newobj.entrySet()) {
            if (set.contains(k.getValue())) {
                duplicate.add(k.getValue());
            } else {
                set.add(k.getValue());
            }
        }
        System.out.println("Duplicate Values are :"+ duplicate);

    }
}

