public class UKG001 {
    public void m1(int a, int b){
        System.out.println(a+b);

    }
    public int m2(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        UKG001 ukg = new UKG001();
        ukg.m2(10,30);
        ukg.m1(10,40);

    }
}
