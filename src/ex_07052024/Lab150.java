package ex_07052024;

public class Lab150
{
    public static void main(String[] args)
    {            //Functions with return type  use int and byte

        int result= sum_of_two_numbers();
        System.out.println(result);

        byte re1=(byte)multiple();
        System.out.println(re1);
    }
    static int sum_of_two_numbers()
    {
            return 5+6;
    }
    static int multiple()
    {
    return 9*8;
    }
}

