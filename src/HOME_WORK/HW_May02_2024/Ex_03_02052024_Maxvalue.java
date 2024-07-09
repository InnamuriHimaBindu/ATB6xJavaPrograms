package HOME_WORK.HW_May02_2024;

import java.util.Scanner;

public class Ex_03_02052024_Maxvalue {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        double[] val=new double[4];
        double max=val[0];
        System.out.println("Enter 1st value");
        val[0]=sc.nextDouble();
        System.out.println("Enter 2nd value");
        val[1]=sc.nextDouble();
        System.out.println("Enter 3rd value");
        val[2]=sc.nextDouble();
        for(int i=0;i<val.length;i++)
        {
            if(val[i]>max)
                max = val[i];

        }
        System.out.println("maximuam valus is:" + max);

    }

}
