package ex_25042024;

import java.util.Scanner;

public class Lab092 {
    public static void main(String[] args) {
        //program to check grade based on marks
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks");
        int marks=sc.nextInt();
        marks=marks/10;
        System.out.println(marks);
        switch(marks)
        {
            case 9:
                System.out.println("A");        //90->90/100->9->A
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("c");
                break;
            case 1:
                System.out.println("F");
                break;
            default:
                System.out.println("None");
        }sc.close();

    }
}
