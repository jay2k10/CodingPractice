public class TCS001 {
    public static void main(String[] args) {
        String s = "Ravi Teja Bompally";
        String[] s2 = s.split(" ");
        String s3 = s2[0].charAt(0) + "." + s2[1].charAt(0) + "." + s2[2];
        System.out.println("String output is: " + s3);
    }
}
