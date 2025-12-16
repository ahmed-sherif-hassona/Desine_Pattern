public class ShoppingCart {
    private Paystrategy paystrategy;

   public void setPay(Paystrategy paystrategy)
   {
       this.paystrategy=paystrategy;
   }
   public void check(int amount)
   {
       paystrategy.Pay(amount);
   }
}
