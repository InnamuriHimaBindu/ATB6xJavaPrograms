package ex_27042024;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num1");
        int num1=sc.nextInt();

        System.out.println("Enter a num2");
        int num2=sc.nextInt();

        System.out.println("Enter a num3");
        int num3=sc.nextInt();

        int max=(num1>num2)?num1:num2;
        int result=(max>num3)?max:num3;
        System.out.println(result);
        sc.close();
    }
}
