import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        
        
        stack.push("10");
        stack.push("20");
        stack.push("30");
        
        System.out.println(stack); 
        
        
        stack.pop();
        
        System.out.println(stack); 
    }
}