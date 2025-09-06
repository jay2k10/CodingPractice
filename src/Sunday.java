public class Sunday {
    public Sunday() {
        System.out.println("Constructor initialization");
    }

    public static void main(String[] args) {
        try{
            int a = 10/0;
            System.out.println("Not printed");

        }catch (Exception e){
            System.out.println("Exception caught");

        }finally {
            System.out.println("Finally block executed!");
        }

    }
}
