package HOME_WORK.HW_May4_2024;

public class Ex2_elementexist {
    public static void main(String[] args) {
        //Write a Java method to check if a given element exists in a 2D array  ex:8 true
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int ele=8;
        boolean flag=false;
        System.out.println("Elements are->");
        for(int i=0;i< arr.length;i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }

        for(int i=0;i< arr.length;i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                    if (arr[i][j] ==ele)
                    {
                        flag = true;
                        break;
                    }
            }
        }
        System.out.println("\n Exist element is->" +flag);

    }
}
