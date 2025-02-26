package _ex21022025.Constructor_EX;

public class Training extends Practice {
    public Training() {
        //super();
        //this(10);
        //this(1,2);
        System.out.println("Child constructor");

    }

    public Training(int a) {
        this();

        System.out.println("Child constructor");

    }

    public Training(int a, int b) {
        //super();
        System.out.println("Child constructor");

    }

    void m1() {
        System.out.println("First method");
    }

    public static void main(String[] args) {


        Training t = new Training();
        t.m1();

    }
}
