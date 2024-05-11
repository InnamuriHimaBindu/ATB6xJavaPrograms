package HOME_WORK.HW_May4_2024;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Ex6_Anagram
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st String");
        String str1=sc.next();
        System.out.println("Enter 2nd String");
        String str2=sc.next();

        if(str1.equals(str2))
        {
            System.out.println("Both string should not be same");
            System.exit(0);
        }

        int c=0;
        for(int i=0;i<str1.length();i++)
        {
            for(int j=0;j<str2.length();j++)
            {
                if(str1.charAt(i)== str2.charAt(j))
                {
                    c++;
                    break;
                }
            }
        }
        if(c==str1.length())
        {
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not anagram");
        }





       /* if(str1.length()==str2.length())
        {
            boolean flag= true;
            for(int i=0;i<str1.length();i++)
            {
                char ch=str1.charAt(i);
                int index=str2.indexOf(ch);
                int index2=str2.lastIndexOf(ch);

                if(index!=-1)
                {
                    if(index != index2)
                    {
                        flag=false;
                        break;
                    }
                }
            }
            if(flag)
                System.out.println("Anagrams");
            else System.out.println("Not anagrams");
        }
        //System.out.println("Not anagrams");*/
    }
}
