package learnJavaCodingForAutomation.stringCodingQuestions;

public class InputHelloOutputHHEELLOO {
    public static void main(String[] args) {
        String s = "Hello";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != 'l') {
                sb.append(c).append(c);
            } else {
                sb.append(c);
            }

        }
        String s3 = sb.toString();
        System.out.println("Output is :" + s3);

    }
}
