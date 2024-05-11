package HOME_WORK.HW_May4_2024;

public class Ex1_Maxvalue2Darray {
    public static void main(String[] args) {
        //Write a java program to find the max value ina 2D array
      //  int[][] arr={{1,4,3},}
        //             {4,5,6},
        //             {7,8,9}};

        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int max=0;
       // int max1=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j< arr.length;j++)
            {
                System.out.print(arr[i][j] +" ");
                {
                    if (arr[i][j] > max)
                    {
                        max = arr[i][j];
                    }
                }
            }
            System.out.print("\n");
        }
       /* for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i][j]>max)
                {
                    max=arr[i][j];
                    }
            }
        }*/
        System.out.println("Max value is->:" +max);

    }
}
