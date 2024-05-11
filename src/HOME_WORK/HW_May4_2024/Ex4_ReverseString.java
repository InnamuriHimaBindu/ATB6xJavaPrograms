package HOME_WORK.HW_May4_2024;

public class Ex4_ReverseString {
    public static void main(String[] args) {
        String s="Hello";
        System.out.println("String is->:" +s);
        char[] rev=s.toCharArray();
        System.out.println("Reverse String is->:");
        for(int i=rev.length-1;i>=0;i--)
        {
            System.out.print(rev[i]);

        }
        System.out.println("-------------------");
        String s1="World";

        System.out.println("Reverse String is->:");
        for(int i=s1.length()-1;i>=0;i--)
        {
            System.out.print(s1.charAt(i));

        }
    }
}
