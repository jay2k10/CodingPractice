package _ex21022025.Variables_methods_Blocks;

public class StaticA {

    {
        System.out.println("Parent instance block");
    }
    static {
        System.out.println("Parent static block");
    }

    public StaticA() {
        //this(10);
        System.out.println("parent constructor!!");
    }
    public StaticA(int a) {
        this();
        System.out.println("parent parameter constructor!!");
    }
 int m1(){
        System.out.println("Parent method");
        return 50;
    }

    private void m5(){
        System.out.println("Private parent");

    }


    
    public static void main(String[] args) {
        StaticA a = new StaticA(10);
        a.m5();
        
    }
}
