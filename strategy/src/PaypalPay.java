public class PaypalPay implements Paystrategy{
   private String email;
   PaypalPay(String email)
   {
       this.email=email;

   }
    @Override
    public void Pay(int amount) {
        System.out.println("ok pay "+amount +" Paypal");
    }
}
