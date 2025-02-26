package _ex23022025._priyankaBatch;

public interface I001 {

    void m1();
    void m2();

    default void m3(){
        m4();
        System.out.println("hey");
    }

    private void m4(){
        System.out.println("hey 4");
    }


    public static void main(String[] args) {

    }
}
