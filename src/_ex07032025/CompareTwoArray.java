package _ex07032025;

import java.util.Arrays;

public class CompareTwoArray {
    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        int [] b = {4,2,3,7};
         boolean flag = true;

        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        if(a.length!=b.length){
            System.out.println("both are not equal");
            return;
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=b[i]){
                flag = false;
            }

        }if(flag==true){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }
}
