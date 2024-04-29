package ex_20042024;

public class Lab056_SCP {
    public static void main(String[] args) {
        String name="The Testing Academy";          //Both are in string control pool,same name so 1 string created
        String name1="The Testing Academy";

        String name2=new String("The Testing Academy");   //store in Object area, so this program totally have 2 string

    }
}
