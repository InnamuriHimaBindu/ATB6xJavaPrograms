package ex_20042024;

public class Ex2 {
    public static void main(String[] args) {
        //Value of x,y,z-double-result  3 (x2+y2-|z|)

        int a=10,b=20;
        double z=-125, p=2;
        double exp1,exp2,exp3,result,result1;
        exp1=Math.pow(a,2);             //10*10->100
        exp2=Math.pow(b,2);             //20*20->400
        exp3=Math.abs(z);               //125
        System.out.println(exp3);

        result= exp1+exp2-exp3;         //100+400-125=  375
        System.out.println(result);

        result1=Math.cbrt(result);
        System.out.println(result1);
    }
}
