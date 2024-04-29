package ex_23042024;

import java.util.Scanner;

public class Lab076 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();           //else if condition
        if(num>20)
        {
            System.out.println("num>20");
        }
        else if(num>10)
        {
            System.out.println("num is between 10 & 20");
        }
        else {
            System.out.println("num is <20");
        }

    }
}
