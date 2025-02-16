package ex_15012025.collectionFramework;


import java.util.ArrayList;
import java.util.List;

public class Coll002 {
    public static void main(String[] args) {
        List<String> mylisy = new ArrayList();
        mylisy.add("Jay");
        mylisy.add("shankar");
        System.out.println(mylisy);

        for(String s :mylisy){
            System.out.println(s);
        }
        for (int i = 0; i <mylisy.size() ; i++) {
            System.out.println(mylisy.get(i));



        }

    }
}
