package HOME_WORK;

import java.util.Scanner;

public class Ex8_23042024_Leaptear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();

        if((n%400==0) || (n%4==0 && n%100 !=0))
        {
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not Leap year");
        }
        sc.close();
    }
}
