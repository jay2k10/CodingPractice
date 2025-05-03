public class Jay002 {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "abce";
        int k = 1;
        int diff = 0;

        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)!=s2.charAt(i)){
                diff++;
            }

        }
        if(diff==k){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
