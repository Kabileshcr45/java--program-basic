
import java.util.*;

 class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        
        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        
        
        System.out.println("First fruit: " + fruits.get(0));
        
       
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
         fruits.remove("Banana");
        System.out.println("After removal: " + fruits);
    }
}