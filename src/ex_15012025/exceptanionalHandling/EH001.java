package ex_15012025.exceptanionalHandling;

public class EH001 {
    public static void main(String[] args) {
        String p1 = args[0];
        int p2 = Integer.parseInt(p1);

        try {
          int b = 100/p2;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //System.out.println(b);
        }
        System.out.println("End of the program");
    }
}
