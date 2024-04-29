package HOME_WORK;

import java.util.Scanner;

public class Ex5_23042024_Positive_negative {
    public static void main(String[] args) {
        //Program to check positive, negative numbers and zero
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");
        int num=sc.nextInt();
        if(num >0)
        {
            System.out.println("Positive Numbers");
        }
        else if(num<0){
            System.out.println("Negative numbers");
        }else
        {
            System.out.println("zero");
        }
        sc.close();
    }
}
