package _ex21022025;

public class Practice {
    public Practice(int a, int b) {
        this(10);
       // this(10,20,30);

        System.out.println(a+b);

    }
    public Practice(int a, int b, int c){
        System.out.println("Three parameter");
    }


    public Practice(int a) {
        System.out.println("one parameter");
    }

    public static void main(String[] args) {

        Practice p = new Practice(10, 20);
        Practice p1 = new Practice(10,20,30);


    }
}
