
import java.util.*;
import java.io.*;
import java.time.*;


public class Main {
    public static void main(String[] args) {
     Car car=CarFactory.getCar("Bmw");
     car.drive();

      car=CarFactory.getCar("Benz");
      car.drive();

        car=CarFactory.getCar("toyota");
        car.drive();
    }
}
