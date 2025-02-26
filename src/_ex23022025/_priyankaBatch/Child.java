package _ex23022025._priyankaBatch;

public class Child extends Parent{
    public void m1(){
        System.out.println("Child Method");
    }

    public static void main(String[] args) {

        Parent p = new Parent();
        p.m1();
    }
}
