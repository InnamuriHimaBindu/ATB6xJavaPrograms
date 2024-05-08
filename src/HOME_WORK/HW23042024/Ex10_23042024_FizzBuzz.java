package HOME_WORK.HW23042024;

import java.util.Scanner;

public class Ex10_23042024_FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<=100;i++)
        {
            if(i%3==0 && i%5==0)
            {
            System.out.println("Fizzbuzz");
            }
            else if(i%3==0)
            {
            System.out.println("Fizz");
            }
            else if(i%5==0) {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
