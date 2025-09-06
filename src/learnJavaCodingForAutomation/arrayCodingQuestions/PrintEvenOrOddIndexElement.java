package learnJavaCodingForAutomation.arrayCodingQuestions;

public class PrintEvenOrOddIndexElement {
    public static void main(String[] args) {
        String[] a = {"Java", "Selenium", "TestNG", "Maven", "Jenkins", "Docker"};

        for (int i = 0; i < a.length; i = i + 2) {
            System.out.println("Even position element is: " + a[i]);
        }
        System.out.println("----------------------------");
        for (int i = 1; i < a.length; i = i + 2) {
            System.out.println("Odd position element is: " + a[i]);
        }
    }
}
