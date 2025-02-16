package ex_16022025.ex_String;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s = "jai sarswati mata";
        System.out.println("Old String :"+s);
        String s1 = s.replace(" ","");
        System.out.println("After space replace :"+s1);

        Map<Character,Integer> map = new HashMap();
        for (int i = 0; i < s1.length(); i++) {
            Character c = s1.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);

            }else{
                map.put(c,1);
            }

        }
        for (int i = 0; i < s1.length(); i++) {
            Character c1 = s1.charAt(i);
            if(map.get(c1)==1){
                System.out.println("First non repeating character is :"+c1);
                break;

            }


        }
        //System.out.println("String has no unique character.....");

    }


}
