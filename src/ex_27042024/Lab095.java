package ex_27042024;

import java.util.Scanner;

public class Lab095 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num1");
        int num1=sc.nextInt();

        System.out.println("Enter a num2");
        int num2=sc.nextInt();

        System.out.println("Enter a num3");
        int num3=sc.nextInt();

        if(num1>=num2 && num1>=num3)
        {
            System.out.println(num1);
        }else if(num2>=num3 && num2>=num1){
            System.out.println(num2);
        }
        else {
            System.out.println(num3);
        }                                   //another way

        int largest=(num1>num2)?((num1>num3)?num1:num3):((num2>num3)?num2:num3);
        System.out.println(largest);

    }
}
