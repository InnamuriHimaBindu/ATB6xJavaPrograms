package ex_20042024;

public class Ex1 {
    public static void main(String[] args) {
        //Max between 3 numbers wih Ternary(?) operator

        int a=10;
        int b=20;
        int c=30;
        int max=a<b?b:a;        //10<20->T (if true  b=20 false a=10)
        int max1= max<c?c:max;  //20<30 c=30

        System.out.println("max value is:\t" + max1);
    }
}
