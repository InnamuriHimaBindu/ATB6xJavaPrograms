package HOME_WORK;

import java.util.Scanner;

public class Ex6_23042024_Largestnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a num1");
        int n1=sc.nextInt();

        System.out.println("Enter a num2");
        int n2=sc.nextInt();

        System.out.println("Enter a num3");
        int n3=sc.nextInt();


        if((n1>n2) && (n1>n3))
        {
            System.out.println("Largest value:" +n1);
        }
        else if((n2>n3) && (n2>n1))
        {
            System.out.println("Largest value:" +n2);
        }
        else if((n3>n1 && n3>n2))
        {
            System.out.println("Largest value:" +n3);
        }
        else {
            System.out.println("null");
        }
        sc.close();
    }
}
