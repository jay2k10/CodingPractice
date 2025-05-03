package learnJavaCoding.arrayCodingQuestions;

import java.util.ArrayList;

public class ArrayListSortedOrNot {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("banana");
        list.add("an");
        list.add("cherry");
        boolean b = true;

        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(i).compareTo(list.get(i+1))>0){
                b= false;
            }

        }
        if(b==true){
            System.out.println("Array list is sorted");
        }if(b==false){
            System.out.println("Array list is not sorted");
        }

    }
}
