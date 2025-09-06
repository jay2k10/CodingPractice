public class InfosysOutput2 {
    public static void main(String[] args) {
        try{

            int num1 = 2;

            int num2 =0;

            int div = num1/num2;

            System.out.println(div);

}

        catch(ArithmeticException e){

            System.out.println(e.getMessage());

        }

        catch(Exception e1){

            System.out.println(e1.getMessage());

        }
    }
}
