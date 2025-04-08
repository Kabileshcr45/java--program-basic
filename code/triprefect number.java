/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;

      
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

       
        if (sum == 3 * num) {
            System.out.println(num + " is a Triperfect Number.");
        } else {
            System.out.println(num + " is NOT a Triperfect Number.");
        }
    }
}
    