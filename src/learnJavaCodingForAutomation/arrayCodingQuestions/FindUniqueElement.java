package learnJavaCodingForAutomation.arrayCodingQuestions;

import java.util.HashSet;
import java.util.Set;

public class FindUniqueElement {
    public static void main(String[] args) {
        int [] arr = {4,4,1,3,3,2,5,5};
        Set<Integer> set = new HashSet<>();
        for(Integer k:arr){
            set.add(k);
        }
        System.out.println("Unique element in an array is: "+set);
    }
}
