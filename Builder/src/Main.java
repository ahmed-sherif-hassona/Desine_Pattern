import java.util.*;
import java.io.*;
import java.time.*;


public class Main {
    public static void main(String[] args) {
        // Director
        Waiter waiter = new Waiter();

        // Choose Builder
        PizzaBuilder builder = new SpicyPizzaBuilder();
        // PizzaBuilder builder = new HawaiianPizzaBuilder();

        // Build pizza
        waiter.setPizzaBuilder(builder);
        waiter.constructPizza();

        // Get final product
        Pizza pizza = waiter.getPizza();

        // Print result
        System.out.println(pizza);
    }
}

