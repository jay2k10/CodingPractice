package Comparator_Comparable.interfaceEx;

public interface Jay {
    void m1();
    void m2();

    default void m3(){
        System.out.println("implemented method");
    }
    private void m4(){
        System.out.println("implemented method");
    }
   static void m5(){
       System.out.println("Static");
    }

    public static void main(String[] args) {
        Jay.m5();
    }
}
