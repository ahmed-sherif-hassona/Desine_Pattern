public class InstaPay implements Paystrategy{
    private String number;

    InstaPay(String number)
    {
        this.number=number;
    }

    @Override
    public void Pay(int amount) {
        System.out.println("ok pay  "+amount +" with Paypal");
    }
}
