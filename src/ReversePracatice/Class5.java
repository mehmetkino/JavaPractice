package ReversePracatice;

import java.util.Scanner;

public class Class5 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a String:" );
        String str= scan.nextLine();

        int len= str.length();

        String reverse="";
        System.out.println("Before reversing : " + str);

        for(int i= len-1 ; i>=0; i--){

            reverse= reverse +str.charAt(i);

        }
        System.out.println("After reversing:" +reverse);


        StringBuffer sf= new StringBuffer(str);
        System.out.println(sf.reverse());

    }
}
