package ex_04052024;

import java.util.Scanner;

public class Lab144 {
    public static void main(String[] args) {
        //palindrome

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string,i will check if it is palindrome or not");

        String user_input=sc.next();
        StringBuilder sb =new StringBuilder(user_input);

        String re_user_input=sb.reverse().toString();

        if(user_input.equalsIgnoreCase(re_user_input))
        {
            System.out.println("palindrome->" +user_input);
        }
        else
        {
            System.out.println("Nope");
        }
    }
}
