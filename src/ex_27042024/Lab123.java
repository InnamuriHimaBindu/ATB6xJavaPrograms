package ex_27042024;

import java.util.Scanner;

public class Lab123 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");           //arithmetic operators
        int input1=sc.nextInt();

        System.out.println("Enter a number");
        int input2=sc.nextInt();

        System.out.println("Enter operator");
        char operator=sc.next().charAt(0);
        switch(operator)
        {
            case '+':
                System.out.println("Result:" +(input1+input2));
                break;
            case '-':
                System.out.println("Result:" +(input1-input2));
                break;
            case '*':
                System.out.println("Result:" +(input1*input2));
                break;
            case '/':
                System.out.println("Result:" +(input1/input2));
                break;
            case '%':
                System.out.println("Result:" +(input1%input2));
                break;
            default:
                System.out.println("Invalid operators");

        }sc.close();
    }
}
