import java.util.*;
import java.io.*;
import java.time.*;


public class Main {
    public static void main(String[] args) {
         CurrentConditionDisplay observer1=new CurrentConditionDisplay();
         wheatherData wheather=new wheatherData();
          wheather.registerObserver(observer1);
          wheather.setTemperature(23,56);
          wheather.setTemperature(27,60);


    }
}

