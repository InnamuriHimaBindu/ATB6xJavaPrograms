package ex_27042024;

import org.w3c.dom.ls.LSOutput;

public class Lab109 {
    public static void main(String[] args)
    {
        for(int i=1;i<=10;i++)
        {     System.out.println(i);
            if (i == 5)
                break;
        }
        for(int j=0;j<5;j++)
        {
            if (j == 3)
            {
                break;
            }
            System.out.println(j);
        }
    }

}
