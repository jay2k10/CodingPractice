package learnJavaCodingForAutomation.generalCodingQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertListToSet {
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>();
        namesList.add("Alice");
        namesList.add("Bob");
        namesList.add("Alice"); // Duplicate
        namesList.add("Charlie");
        System.out.println("Original List :" + namesList);
        Set<String> set = new HashSet<>(namesList);
        System.out.println("Convert list to set :" + set);
    }
}
