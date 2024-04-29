package ex_20042024;

public class Lab060_equals {
    public static void main(String[] args) {

        String s1=new String("pramod");
        String s2=new String("pramod");
        System.out.println(s1==s2);                     //object area
        System.out.println(s1.equals(s2));

        System.out.println("000");
        String a1="p";
        String a2="p";                      //string control pool
        System.out.println(a1==a2);
    }
}
