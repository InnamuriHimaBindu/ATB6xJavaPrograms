package ex_20042024;

public class Lab064 {
    public static void main(String[] args)
    {
        String password="Pramod";
        String pass_u=password.toLowerCase();
        System.out.println(pass_u==password);       //fail

        System.out.println(pass_u.equals(password));    //fail
        System.out.println(pass_u.equalsIgnoreCase(password));  ///true  capital and small letters ignore

        System.out.println(password.substring(0,3));    //pra
        System.out.println(password.indexOf("a"));      //2
    }

}
