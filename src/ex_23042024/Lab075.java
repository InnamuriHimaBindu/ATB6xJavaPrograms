package ex_23042024;

import java.util.Scanner;

public class Lab075 {
    public static void main(String[] args) {
        //maximum number in two
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter num1");
        int num1=sc.nextInt();

        System.out.println("Enter num2");
        int num2=sc.nextInt();
                                //one way
            int max=Math.max(num1,num2);
             System.out.println(("Max by Math fun()" +max));
                                //another way
        if(num1>num2)
        {
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }
        sc.close();
    }
}
