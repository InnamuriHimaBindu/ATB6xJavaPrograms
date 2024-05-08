package HOME_WORK.HW23042024;

import java.util.Scanner;

public class Ex7_23042024_vowelsconsonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a character");
        char ch=sc.next().charAt(0);

        if( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch =='A' || ch== 'E' || ch=='I' || ch=='O' || ch=='U')
        {
            System.out.println("Vowels");
        }else
        {
            System.out.println("consonants");
        }
        sc.close();
    }
}
