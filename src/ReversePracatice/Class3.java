package ReversePracatice;

import java.util.Arrays;
import java.util.ArrayList;


public class Class3 {

    public static void main(String[] args){

        String str ="Hamdullah is typing";


        String reverse="";

        char ch;

        for ( int i=0; i<str.length(); i++){
            ch=str.charAt(i);

            reverse= ch + reverse;
        }
        System.out.println(reverse);


    }
}
