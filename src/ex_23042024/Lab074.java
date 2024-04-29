package ex_23042024;
import java.util.Scanner;

public class Lab074 {
    public static void main(String[] args)
    {
        //Taking the number using scanner
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number");
        int num=sc.nextInt();

        if(num%2==0)
        {
            System.out.println("even");
        }else {
            System.out.println("odd");
        }

    }
}
