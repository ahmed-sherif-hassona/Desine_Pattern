
public class createdCardPay implements Paystrategy
{
   private String number;
    createdCardPay(String number){
        this.number=number;
    }
    @Override
    public void Pay(int amount) {
        System.out.println("ok pay "+amount +" with createdCard");
    }
}
