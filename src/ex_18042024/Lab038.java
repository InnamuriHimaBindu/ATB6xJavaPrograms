package ex_18042024;

public class Lab038 {
    public static void main(String[] args) {
        int a=67;
        boolean b=!(a>20 && a<78);  //t & F -> F  ==>o/p T
        System.out.println(b);

        int a1=65;
        boolean b1= a1>30 && a1<66;     //t & F->f->
        System.out.println(b1);
    }
}
