import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test001 {
    public static void main(String[] args) {
        int [] a ={1,2,2,3,3,34,6,7,8};

        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            Integer j = a[i];
            if(map.containsKey(j)){
                map.put(j,map.get(j)+1);
            }else{
                map.put(j,1);
            }

        }
        for(Integer k : map.keySet()){
            if(map.get(k)>1){
                list.add(k);
            }
        }
        System.out.println("Duplicate element is: "+list);

    }
}
