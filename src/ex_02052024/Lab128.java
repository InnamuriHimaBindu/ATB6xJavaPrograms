package ex_02052024;

public class Lab128 {
    public static void main(String[] args) {
        int a[]={27,31,32,34,};
        System.out.println(a.length);

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("-----------------");
        for(int i=1;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("--------------------");
        for(int i=1;i<a.length-1;i++)
        {
            System.out.println(a[i]);
        }
    }
}
