package ex_02052024;

import java.util.Scanner;

public class Lab132 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float[] marks=new float[5];

        System.out.println("Enter the first sub1 marks");
        marks[0]=sc.nextFloat();

        System.out.println("Enter the first sub2 marks");
        marks[1]=sc.nextFloat();

        System.out.println("Enter the first sub3 marks");
        marks[2]=sc.nextFloat();

        System.out.println("Enter the first sub4 marks");
        marks[3]=sc.nextFloat();

        System.out.println("Enter the first sub5 marks");
        marks[4]=sc.nextFloat();

        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]<30)
            {
                System.out.println("Failed in this subject ->" +marks[i]);
            }
            System.out.println(marks[i]);
        }sc.close();
    }
}
