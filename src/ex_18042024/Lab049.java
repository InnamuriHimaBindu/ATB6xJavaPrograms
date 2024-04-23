package ex_18042024;

public class Lab049 {
    public static void main(String[] args) {
        int a=10;
        System.out.println(++a + a++ + a++);  //11+11+  12++  a=13->11+11+12->34
        System.out.println(a);                  //13
    }
}
