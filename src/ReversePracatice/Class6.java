package ReversePracatice;

import java.util.Scanner;

public class Class6 {
    public static void main(String[] args){

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a String you want to be reversed:");
        String str= scan.nextLine();

        int len= str.length();
        String rev="";
        System.out.println("Entered String is :" + str);


        for(int i= len-1 ; i>=0; i--){
            rev= rev + str.charAt(i);

        }
        System.out.println("Entered String after being reversed:" + rev);

        StringBuffer sf= new StringBuffer(str);
        System.out.println(sf.reverse());
    }
}
