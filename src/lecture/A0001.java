package lecture;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class A0001 {
    public static void main(String[] args) {
      int [] arr = {1,2,2,3,3,3,4,5,6,7,8,5,0};
        Map<Integer,Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < arr.length; i++) {
            Integer j = arr[i];
            if (map.containsKey(j)) {
               map.put(j,map.get(j)+1);
            }else{
                map.put(j,1);
            }

        }
        for(Integer k: map.keySet()){
            if(map.get(k)>=2){
                System.out.println(k +" : "+map.get(k));
            }
        }
    }

}
