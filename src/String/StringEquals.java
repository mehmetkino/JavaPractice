package String;

public class StringEquals {
    public static void main(String[] args) {
        String word1 = "Hello"; //this is created in the pool area
        String word2= "Hello"; //this is not created its justusing the same location
        String  word3 = new String("Hello"); //anything new is being created in the heap area

        System.out.println(word1.equals(word2));//true
        System.out.println(word1==word2);
        System.out.println(word1==word3);

        /**
         * equals checks for exact text match
         * but equal operator looks for exact match plus location
         */
    }
}
