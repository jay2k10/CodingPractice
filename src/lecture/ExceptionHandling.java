package lecture;

public class ExceptionHandling {
    public static void main(String[] args) {

        try {
            System.out.println(10/0);
        } catch (NullPointerException e) {
            //throw new RuntimeException(e);
            System.out.println("exception occurred");
        }
    finally {
            System.out.println("finally block");
        }
    }
}
