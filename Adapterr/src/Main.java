import java.util.*;
import java.io.*;
import java.time.*;


public class Main {
    public static void main(String[] args) {
       Adaptee adaptee=new Adaptee();
       Atarget adapter=new objectAdapter(adaptee);
       Client client= new Client(adapter);
       client.Upwork();
    }
}

