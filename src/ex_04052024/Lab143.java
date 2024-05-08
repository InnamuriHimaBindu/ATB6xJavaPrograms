package ex_04052024;

public class Lab143 {
    public static void main(String[] args) {
        String s1="vani";
        String s2=new String("Dutta");

        StringBuffer sb=new StringBuffer("vasu");
        sb.append("dutta");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        StringBuilder sbr=new StringBuilder("vasu");
        sbr.append("dutta");
        System.out.println(sbr);
        System.out.println("--------------");

        String password="pass@word";
        password="123";
        //Mutable-that can be changed
        StringBuilder password2=new StringBuilder("pramod");
        password2.append("dasu");
        System.out.println(password2);

    }

}
