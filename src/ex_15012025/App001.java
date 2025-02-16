package ex_15012025;

public class App001 {
    public static void main(String[] args) {
        String str = "my very educated mother just show us nine planets";
        int vCount =0;
        int cCount =0;

        String [] str2 = str.split("\s");
        for (String s :str2)
        System.out.println(s);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vCount++;

            }
            if (ch>='a'|| ch<='z'){
                cCount++;

            }

        }
        System.out.println(vCount);
        System.out.println(cCount);
    }
}
