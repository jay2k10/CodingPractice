package _ex21022025.Variables_methods_Blocks;

public class StaticB extends StaticA{

    public StaticB() {
        this(10);
        System.out.println("Child constructor!!");
    }
    void m2(){
        System.out.println("Child method");
    }
    int m1(){
        System.out.println("Child  method m1");
        return 11;
    }

    public StaticB(int a) {
        System.out.println("Parameterised constructor!!");
    }

    static {
        System.out.println("Child static block");
    }
    final void m3(){

    }
    final void m3(int q){

    }
    private void m5(){
        System.out.println("Child private");

    }

    public static void main(String[] args) {

       StaticB b = new StaticB();
        b.m1();
        //b.m2();
        b.m5();


    }
}
