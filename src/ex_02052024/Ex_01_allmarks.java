package ex_02052024;

import java.util.Scanner;

public class Ex_01_allmarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        float[] marks=new float[5];


        System.out.println("Enter 1 sub marks");
        marks[0]=sc.nextFloat();

        System.out.println("Enter 2nd sub marks");
        marks[1]=sc.nextFloat();

        System.out.println("Enter 3rd sub marks");
        marks[2]=sc.nextFloat();

        System.out.println("Print all marks");

        for(int i=0;i<marks.length;i++)
        {

            System.out.println(marks[i]);
        }
        sc.close();
    }
}
