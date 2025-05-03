package ex_19022025.arrayProblem;

public class jay1 extends jay{
    @Override
    void m1() {
        System.out.println("method 1");

    }

    @Override
    void m2() {
        System.out.println("method 2");

    }

    @Override
    public void m3() {
        System.out.println("method 3");

    }

    public static void main(String[] args) {
        jay1 jay1 = new jay1();
        jay1.m1();
        jay1.m2();
        jay1.m3();

    }
}
