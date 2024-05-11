package ex_07052024;

import java.util.Scanner;

public class Lab154 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1");
        int num1=sc.nextInt();
        System.out.println("Enter num2");
        int num2=sc.nextInt();

        //calculator
        int r_sum=sum(num1,num2);
        System.out.println("sum is->" +r_sum);
        int r_sub=sub(num1,num2);
        System.out.println("Sub is ->" +r_sub);
        int r_mul=mul(num1,num2);
        System.out.println("Mul is ->" +r_mul);

        int r_sum2=sum(34,45);
        System.out.println("sum2 is->" +r_sum2);
    }
    static int sum(int a,int b)
    {
        return a+b;
    }
    static int sub(int a,int b)
    {
        return a-b;
    }
    static int mul(int a,int b)
    {
        return a*b;
    }
}
