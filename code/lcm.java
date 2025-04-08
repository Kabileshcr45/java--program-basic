/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        
        int lcm;
        if(n1>n2){
        lcm=n1;
        }
        else{
            lcm=n2;
        }
        while(true){
            if(lcm%n1==0 && lcm %n2 ==0){
                System.out.println(lcm);
                break;
            }
            lcm++;
        }
        }
    }
