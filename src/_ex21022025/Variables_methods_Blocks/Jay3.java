package _ex21022025.Variables_methods_Blocks;

public class Jay3 {
    {
        System.out.println("IIB");

    }

    public Jay3() {

        this(10);
        m1();

        System.out.println("Cons");
    }

    public Jay3(int a) {

        System.out.println("Parameterised Cons");
    }
    public void m1(){
        System.out.println("M1 Method");
    }

    public static void main(String[] args) {
        Jay3 jay3 = new Jay3();
    }

}
