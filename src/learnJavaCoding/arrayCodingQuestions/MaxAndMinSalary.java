package learnJavaCoding.arrayCodingQuestions;

public class MaxAndMinSalary {
    public static void main(String[] args) {
        int[] salaries = {100, 10, 500, 200};
        int max = salaries[0];
        int min = salaries[0];
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] < min) {
                min = salaries[i];
            }
        }
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] > max) {
                max = salaries[i];
            }
        }
        System.out.println("Maximum salary is: " + max);
        System.out.println("Minimum salary is: " + min);
    }
}