package _ex21022025.Variables_methods_Blocks;

public class Practicei {
    static int i = 10; //Static variable
    int b = 200; //instance variable

    void m1() {  //instance method
        System.out.println("instance method");
        System.out.println(b);
        System.out.println(Practicei.i);

    }

    static void m2() {
        Practicei s = new Practicei();
        System.out.println(s.b);
        s.m1();

        System.out.println("static method");
        System.out.println(i);//static method


    }


    public static void main(String[] args) {
        int c = 50; //local variable

        Practicei p = new Practicei();
       // System.out.println(p.b);
        //System.out.println(Practicei.i);
        //System.out.println(c);
        p.m1();
        Practicei.m2();


    }
}
