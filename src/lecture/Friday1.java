package lecture;

public class Friday1 extends Friday{
    @Override
    void m1() {
        System.out.println("Implemented");
    }

    @Override
    void m2() {
        System.out.println("m2 implemented");
    }

    public static void main(String[] args) {
        Friday1 f1 = new Friday1();
        f1.m1();
        f1.m2();
        System.out.println(f1.i);
    }
}
