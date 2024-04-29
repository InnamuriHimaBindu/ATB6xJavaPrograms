package ex_25042024;

public class Lab089 {
    public static void main(String[] args) {
        char code='A';                  //Use yield
        int val=switch(code) {
            case 'A':
                yield 65;
            case 'B':
                yield 66;
            default:
                System.out.println("not able to find");
                throw new IllegalStateException("error");
        };
    }
}
