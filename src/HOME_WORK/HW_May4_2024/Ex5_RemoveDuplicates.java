package HOME_WORK.HW_May4_2024;

public class Ex5_RemoveDuplicates {
    public static void main(String[] args) {
        String s1="Hello World mallii";
        String s2=" ";
        char c;
        for(int i=0;i<s1.length();i++)
        {
            c=s1.charAt(i);
            if(s2.indexOf(c)==-1)
            {
                s2=s2+c;
            }
        }
        System.out.println(s2);
    }
}
