package ex_07052024;

public class Lab155 {
    public static void main(String[] args) {
        System.out.println("Starting of the program");
       int money= giveMoneyFriend(100);
        System.out.println(money);
       giveMoneyBeg();
        System.out.println("end of the program");
    }

    static void giveMoneyBeg() {
        System.out.println("Blessings");
    }

    static int giveMoneyFriend(int i)
    {
        //After 6 months
        i=i+30;
        return i;
    }
}
