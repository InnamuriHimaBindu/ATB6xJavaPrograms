package HOME_WORK.HW_May11_2024;

public class Payment {

    boolean p_status;
    String p_method;
    int overdue_amnt;

    public void details() {
        System.out.println("Payment Status:" +p_status);
        System.out.println("Mode of payment:" +p_method);
        System.out.println("Overdue Amount:" +overdue_amnt);
    }
}





    /*double amount;
    String paidBy;
    String modeofPayment;

    public void cash()
    {
        System.out.println(" cash is the mode of payment");
    }
    public void card (int cardNo)
    {
        System.out.println("card is the mode of payment");
    }
    public int paymentId()
    {
        return 101;
    }
    public String paidBy(String personName)
    {
        return personName;
    }*/
