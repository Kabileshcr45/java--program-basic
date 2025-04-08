import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        long num1 = sc.nextLong();
        System.out.print("Enter second number: ");
        long num2 = sc.nextLong();
        
        long sum1 = 0; 
        long sum2 = 0; 

       
        for (long i = 1; i <= num1 / 2; i++) {
            if (num1 % i == 0) {
                sum1 += i;
            }
        }

        // Calculate sum of proper divisors of num2 (excluding num2 itself)
        for (long i = 1; i <= num2 / 2; i++) {
            if (num2 % i == 0) {
                sum2 += i;
            }
        }

       
        if (sum1 == num2 + 1 && sum2 == num1 + 1) {
            System.out.println(num1 + " and " + num2 + " are Betrothed Numbers.");
        } else {
            System.out.println(num1 + " and " + num2 + " are NOT Betrothed Numbers.");
        }
    }
}