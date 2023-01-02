package ReversePracatice;

import java.util.Scanner;

public class Class2 {

    //Reverse the charecter of the word Animal

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Put a word here");
        String str= scan.nextLine(), reverse="";

        char ch;

        for( int i =0; i<str.length(); i++){

            ch=str.charAt(i);

            reverse=ch+ reverse;

        }
        System.out.println("Reverse type of the word is:"+ reverse);
    }
}
