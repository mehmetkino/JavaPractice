package ReversePracatice;

public class Class4 {
    public static void main(String[] args) {
        String s = "Hello World";
        int len = s.length(); // 8

        String reverse = "";
        for (int i = len - 1; i >= 0; i--) {

            reverse = reverse + s.charAt(i); // 1-m, 2-mu

        }
        System.out.println(reverse);


        //using stringbuffer class

        StringBuffer sf = new StringBuffer(s);
        System.out.println(sf.reverse());
    }
}
