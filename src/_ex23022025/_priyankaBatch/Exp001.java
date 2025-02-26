package _ex23022025._priyankaBatch;

public class Exp001 {
    int count = 0;
    void increment(){
        count++;
    }

    public static void main(String[] args) {
        Exp001 exp001 = new Exp001();
        Exp001 exp0011 = new Exp001();
        exp001.increment();
        exp0011.increment();
        System.out.println(exp0011.count);
        System.out.println(exp001.count);
    }
}
