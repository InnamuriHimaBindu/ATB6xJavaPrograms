package ex_02052024;

import java.util.Scanner;

public class Ex_02_doublearray
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[3];
        int arr1;
        System.out.println("Enter 1st number");
        arr[0]=sc.nextInt();

        System.out.println("Enter 2nd number");
        arr[1]=sc.nextInt();

        System.out.println("Enter 3rd number");
        arr[2]=sc.nextInt();


        for(int i=0;i<arr.length;i++)
        {
             arr1=arr[i]+arr[i];
             int arr2=arr[i]*arr[i];
            System.out.println(arr1);
            System.out.println("multiple->" +arr2);
        }

      // int[] arr2=new int[1];
     /*   for(int i=0;i<arr.length;i++)
        {
           arr2=arr[i]+arr[i];
        }*/
    }
}
