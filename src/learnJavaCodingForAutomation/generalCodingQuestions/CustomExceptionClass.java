package learnJavaCodingForAutomation.generalCodingQuestions;

public class CustomExceptionClass extends Exception {
    public CustomExceptionClass(String message) {
        super(message);
    }

    public static void main(String[] args) {
        try {
            throw new CustomExceptionClass("no balance");
        } catch (CustomExceptionClass e) {
            System.out.println(e.getMessage());

        }
    }

}
