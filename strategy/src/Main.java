import java.util.*;
import java.io.*;
import java.time.*;


public class Main {
    public static void main(String[] args) {
         ShoppingCart cart1=new ShoppingCart();
        cart1.setPay(new InstaPay("01009826837"));
         cart1.check(99);

        ShoppingCart cart2=new ShoppingCart();
        cart2.setPay(new PaypalPay("ahmedshrif526@gmail.com"));
        cart2.check(99);

        ShoppingCart cart3=new ShoppingCart();
        cart3.setPay(new createdCardPay("0090-3987-8776-8786"));
        cart3.check(99);
    }
}

