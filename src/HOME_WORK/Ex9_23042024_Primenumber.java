package HOME_WORK;

import java.util.Scanner;

public class Ex9_23042024_Primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

         if(n<=1)
         {
             System.out.println("not prime number");
         }
         else if(n==2 || n==3)
         {
             System.out.println("Prime number");
         }
         else if(n%2==0|| n%3==0)
         {
             System.out.println("not prime number");
         }else {
             System.out.println("Prime number");
         }
         sc.close();


    }
}
