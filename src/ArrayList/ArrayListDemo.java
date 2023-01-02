package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        /*Decleare ArrayList

        1-ArrayList al= new ArrayList();
        2-ArrayList<Integer> al= new ArrayList<Integer>();
        3- ArrayList<String> al= new ArrayList<String>();
         */

        ArrayList al= new ArrayList();

        //add new elements to the arraylist
        al.add(100);
        al.add("welcome");
        al.add(15.5);
        al.add('A');
        al.add(true);

        System.out.println(al);//[100, welcome, 15.5, A, true]


        //size
        //[100, welcome, 15.5, A, true]
        System.out.println("Number of elements in array list:\t" +al.size());

        //remove
        al.remove(1);// here is index of 1 will be removed
        al.remove("welcome");// here welcome element will be removed
        System.out.println("after removing elemnt from array list:\t"+al.size());
        System.out.println(al);

        //inser a new element
        //add(index,object);
        al.add(1,"Hello");
        System.out.println("After insertion new ArrayList:\t" +al);

        //retrieve specific element
        System.out.println(al.get(2));//15.5 is 2 element from ArrayList

        //change an element of ArrayList
        al.set(2,"Pyton");
        System.out.println("After setting new value to the index num 2:" +al);
        //[100, Hello, Pyton, A, true]

        //search- contains() this returns true/false value
        System.out.println(al.contains("C#"));//false
        System.out.println(al.contains("Pyton"));//true

        //isEmpty()
        System.out.println(al.isEmpty());// FALSE

        //for loop
        System.out.println("objects of the ArrayList:\t"+al);
        System.out.println("Reading elements by using forloop....");
        for(int i=0; i<=al.size(); i++){//exception there are only 4 objects but size is 5
            System.out.println(al.get(i));
        }

        //for each lopp
        System.out.println("Reading elements of the ArrayList by using for each loop.....");

        for ( Object e: al){
            System.out.println(e);
        }






    }
}
