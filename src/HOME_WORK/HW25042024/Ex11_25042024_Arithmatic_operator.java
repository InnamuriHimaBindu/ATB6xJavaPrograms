package HOME_WORK.HW25042024;

import java.util.Scanner;

public class Ex11_25042024_Arithmatic_operator
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input1");
        int n1=sc.nextInt();

        System.out.println("Enter input2");
        int n2=sc.nextInt();

        System.out.println("Enter operator");
        char ch=sc.next().charAt(0);
        int result;
        switch(ch)
        {
            case '+' :
                result=n1+n2;
                System.out.println("value of + is:" +result);
                break;
            case '-':
                result=n1-n2;
                System.out.println("Value of - is:" +result);
                break;
            case '*':
                result=n1*n2;
                System.out.println("value of * is:" +result);
                break;
            case '/':
                result =n1/n2;
                System.out.println("value of / is:" +result);
                break;

            case '%':
                result =n1%n2;
                System.out.println("value of % is:" +result);
                break;
            default:
                System.out.println("none");

        }sc.close();
    }
}
