package ex_25042024;

import java.util.Scanner;

public class Lab082 {
    public static void main(String[] args) {
        //Take a user input as char and tell the user if it is vowel a,e,i,o,u

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");

        char ch=sc.next().toCharArray()[0];
       // ch=ch.toLowerCase();
        System.out.println(ch);
        switch (ch)
        {
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonants");


        }sc.close();
    }
}
