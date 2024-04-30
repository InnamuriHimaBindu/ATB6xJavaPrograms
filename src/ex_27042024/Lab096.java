package ex_27042024;

import java.util.Scanner;

public class Lab096 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        if(c =='a'|| c =='A'|| c == 'e'||c =='E'||c =='i'||c =='I'||c =='o'|| c== 'O'|| c=='u'||c=='U')
        {
            System.out.println("vowels");
        }else {
            System.out.println("consonants");
        }
    }
}
