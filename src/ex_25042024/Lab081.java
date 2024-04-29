package ex_25042024;

import java.util.Scanner;

public class Lab081 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the browser name!!! where you want to execute the code");
        String browserName=sc.next();
        browserName=browserName.toLowerCase();

        switch(browserName)
        {
            case "chrome":
                System.out.println("Starting the chrome browser");
                break;
            case "firefox":
                System.out.println("Starting firefox browser");
                break;
            case "edge":
                System.out.println("Starting edge browser");
                break;
            default:
                System.out.println("I have no idea which browser is this");

        }sc.close();
    }
}
