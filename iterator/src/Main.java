import java.util.*;
import java.io.*;
import java.time.*;


public class Main {
    public static void main(String[] args) {
        Numbers numbers=new Numbers(Arrays.asList(1,2,3,4,5));
        iterator iterator=numbers.CreateIterator();
        while (iterator.hasNext())
        {
            System.out.print(iterator.Next()+",");
        }
    }
}


