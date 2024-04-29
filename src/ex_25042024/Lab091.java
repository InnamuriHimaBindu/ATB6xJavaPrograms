package ex_25042024;

import java.util.Scanner;

public class Lab091 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        //String name=sc.nextLine();
        String name=sc.next();
        System.out.println("Enter age");
        int age=sc.nextInt();
        System.out.println("Enter salary");
        double salary=sc.nextDouble();
        System.out.println("your data are:" +name);
        System.out.println("your age is:" +age);
        System.out.println("Your salary is:" +salary);
        sc.close();
    }
}
