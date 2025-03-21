package Practice;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        multiplication(5);
    }
    public static int multiplication(int a){
        int i = 1;
        while(i<=10){
            System.out.println(a + "X " +i+ "= "+(a*i));
            i++;

        }

        return i;
    }
}
