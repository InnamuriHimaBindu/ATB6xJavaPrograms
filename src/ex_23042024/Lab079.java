package ex_23042024;

import java.util.Scanner;

public class Lab079 {
    public static void main(String[] args) {
        //Triangle classifier
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side1,side2,side3, I will tell about the trianle");

        int side1=sc.nextInt();
        int side2=sc.nextInt();
        int side3=sc.nextInt();

        if((side1==side2) && (side1==side3) && (side2==side3))
        {
            System.out.println("EQ");
        }
        else if((side1==side2) || (side1==side3) || (side2==side3))
        {
            System.out.println("ISQ");
        }
        else
        {
            System.out.println("scalene");
        }

    }
}
