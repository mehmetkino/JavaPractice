package ReversePracatice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Class1 {

    public static void main(String[] args) {
        //convert regular array to the arraylist

        System.out.println("Before converting");
        String s[]={"cat","dog","squirrel"};
        for( String element: s){
            System.out.println(element);
        }

        ArrayList al= new ArrayList(Arrays.asList(s));
        System.out.println("\nAfter converting elements to the list:"+ al);
        Collections.sort(al);
        System.out.println("after sorting elements:" +al);

        //Question: Reverse the word Alex

        String name="Alex",   a = "";

        char ch;
        System.out.println("Original word: Alex" );
        for( int i= 0; i<name.length(); i++){
            ch= name.charAt(i);
            a= ch+ a;

        }
        System.out.println("Reverse word:"+a);





    }
}
