package ex_04052024;

public class Lab137
{
    public static void main(String[] args) {
        int[][] array_2d={{34,12,11},{34,12,34},{11,23,98}};

        for(int i=0;i< array_2d.length;i++)
        {
            for(int j=0;j<array_2d[i].length;j++)
            {
                System.out.println(array_2d[i][j]);
            }
        }
    }
}
