package lecture;

public class StringPractice {
    public static void main(String[] args) {
        String s1 = "JAY";
        //String s2 =s1;
        String s3 = s1.toLowerCase();
        System.out.println(s3);
        System.out.println(s1); //means immutable in nature

        String a = "shankar";
        String b = "shankar";
        System.out.println(a.equals(b));
        String c = new String("shankar");
        System.out.println(c.equals(b));
    }
}
