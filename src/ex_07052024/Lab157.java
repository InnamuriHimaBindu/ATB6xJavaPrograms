package ex_07052024;

public class Lab157
{
    public static void main(String[] args) {
        f1();
        String[] names={"Hima","Bindu"};
        String[] names1=new String[2];
        names1[0]="Maadhu";
        names1[1]="Sudhan";
        f1(names);
        f1(names1);
    }
    static void f1()
    {
        f2();
        System.out.println("F1");
    }
    static void f2()
    {
        System.out.println("F2");
    }
    static void f1(String[] a)
    {
       /* for(String name : a)        //For each loop
        {
            System.out.println(name);
        }*/
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }
}
