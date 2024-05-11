package ex_07052024;

public class Lab151 {
    public static void main(String[] args)
    {
        int r1=sum(4,5);
        System.out.println(r1);
        int r2=sum(10,11);
        System.out.println(r2);
        String r3=sum1("what",11);
        System.out.println(r3);
        String r4=sum1(5,"joy");
        System.out.println(r4);
        String r5=sum1("jony","joy");
        System.out.println(r5);

    }
    static int sum(int a,int b)
    {
        return a+b;
    }
    static String sum1(String a,int b)
    {
        return a+b;
    }
    static String sum1(int a,String b)
    {
        return a+b;
    }
    static String sum1(String a,String b)
    {
        return a+b;
    }

}
