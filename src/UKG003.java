public class UKG003 extends UKG002 {
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        UKG002 ukg = new UKG003();
        ukg.add(10,20);

    }
}