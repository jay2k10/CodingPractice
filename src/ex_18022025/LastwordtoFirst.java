package ex_18022025;

public class LastwordtoFirst {
    public static void main(String[] args) {

        String str = "We are learning java";
        String[] s = str.split("\s");
        String result = "";

        for (int i = s.length-1; i >= 0; i--) {
            result = result + s[i] + " ";


        }
        System.out.println(result);


    }


}
