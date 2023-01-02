package String;

public class StringIgnoreCase {
    public static void main(String[] args) {

        String word1= "hello";
        String wordb= "Hello";
        System.out.println(word1.equalsIgnoreCase(wordb));//true

        String str= "Kava";
        String str2=" Java";
        String str3= "jAvA";

        boolean b1= str.equalsIgnoreCase(str2);//false
        boolean b2= str.equals(str2);                      //false
        boolean b3= str2.equalsIgnoreCase(str3);//true

        if(b1){
            System.out.println("b1 is true");

             if(b2){
                 System.out.println("b2 is true");
                 if (b3){
                     System.out.println("b3 is true");
                 }else{
                     System.out.println("b3 is false");
                 }


             }else{
                System.out.println("b2 is false");}


        }else{
            System.out.println("b1 is false");
        }

    }
}
