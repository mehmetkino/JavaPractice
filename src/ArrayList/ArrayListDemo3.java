package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {
    public static void main(String[] args) {

        String arr[]={ "Dog", "Cat", "Elephant"};
        //If you want to see the all the elements of the regular array simply
        // use for each loop or forloop
        // System.out.println(arr); doesnt give you elements
        System.out.println("Using for loop for reading elements of the array");
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("\nUsing for each loop for reading elements of the array");

        for( String value: arr){
            System.out.println(value);
        }
        //TO convert this to the ArrayList :
        System.out.println("\nAfter converting this to the ArrayList");

        ArrayList al= new ArrayList(Arrays.asList(arr));
        System.out.println(al);

    }
}
