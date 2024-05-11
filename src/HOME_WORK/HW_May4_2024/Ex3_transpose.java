package HOME_WORK.HW_May4_2024;

public class Ex3_transpose
{
    public static void main(String[] args) {
        //Transpose
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int[][] trans= new int[3][3];
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j< arr.length;j++)
            {
                System.out.print(arr[i][j] +" ");
            } System.out.print("\n");
        }
        System.out.println("Transpose elements are->");
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j< arr.length;j++)
            {
               trans[i][j]=arr[j][i];
                System.out.print(trans[i][j] +" ");

            }
            System.out.print("\n");
        }
    }
}
