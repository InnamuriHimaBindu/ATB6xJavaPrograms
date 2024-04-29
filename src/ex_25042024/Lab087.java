package ex_25042024;

public class Lab087 {
    public static void main(String[] args) {
        int itemcode=004;
        switch(itemcode)
        {
            case 001 -> System.out.println("It is a desktop");
            case 002 -> System.out.println("It is model phone");
            case 003,004-> System.out.println("It is laptop");
            default-> System.out.println("Hello");
        }
        char ch='z';
        switch(ch)
        {
            case 'a','e','i','o','u' -> System.out.println("vowel");
            default -> System.out.println("consonant");
        }
    }
}
