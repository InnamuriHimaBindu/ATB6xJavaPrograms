package ex_20042024;

public class Lab051_Sting {
    public static void main(String[] args) {
        int a=87;
        long b=91;
        String s1="KK";
        String s2="VV";
        System.out.println(s1+s2+a+b);          //KKVV8791
        System.out.println(s1+s2+(a+b));    //KKVV178
    }
}
