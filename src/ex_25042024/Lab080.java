package ex_25042024;

import java.util.Scanner;

public class Lab080 {
    public static void main(String[] args) {
                //if elseif-multiple conditions
        //switch
            Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number 1-7");
        int day=sc.nextInt();
        switch(day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sun");
                break;
            default:
                System.out.println("only numbers 1-7 allowed");
        }sc.close();
    }
}
