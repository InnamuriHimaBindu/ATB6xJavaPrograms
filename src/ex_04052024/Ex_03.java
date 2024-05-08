package ex_04052024;

public class Ex_03 {
    public static void main(String[] args) {
        int n=3;
        for(int i=1;i<=n;i++)               //Right angle triangle
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
