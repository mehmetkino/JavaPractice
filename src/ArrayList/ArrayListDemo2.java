package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        ArrayList al= new ArrayList();
        al.add("x");
        al.add("y");
        al.add("z");
        al.add("a");
        al.add("b");
        al.add("c");

        ArrayList al_dup= new ArrayList();

        al_dup.addAll(al);
        System.out.println(al_dup);

        al_dup.removeAll(al);
        System.out.println("After removing:" +al_dup);

        //Sort---- collections.sort()
        System.out.println("Elements in the array list:"+al);
        Collections.sort(al);
        System.out.println("elements in the array After sorting" +al);

        //reverse order
        Collections.sort(al,Collections.reverseOrder());
        System.out.println("Elements is the array after sorting in reverse order:"+al);

        //Shuffling-- Collection.shuffle()
        Collections.shuffle(al);
        System.out.println( "After shuffling"+al);




    }
}
