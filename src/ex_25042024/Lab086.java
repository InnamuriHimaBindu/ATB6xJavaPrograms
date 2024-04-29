package ex_25042024;

public class Lab086 {
    public static void main(String[] args) {
        int itemcode=002;
        switch(itemcode)
        {
            case 001,002,003:
                System.out.println("It is electronic gadget");
                break;
            case 004,005,007:
                System.out.println("It is mechanical gadget");
                break;
            default:
                System.out.println("none");
        }
    }
}
