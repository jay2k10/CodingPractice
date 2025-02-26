package ex_18022025;

import java.util.HashMap;
import java.util.Map;

public class StringWordCount {
    public static void main(String[] args) {
        String s = "My name is jay jay name";
        int count = 1;

        String [] str = s.split("\s");
        Map<String,Integer> map = new HashMap<>();

        for (int i = 0; i < str.length; i++) {
            if(map.containsKey(str[i])){
                map.put(str[i],count+1);
            }else{
                map.put(str[i],1);
            }

        }
        System.out.println(map);

    }
}
