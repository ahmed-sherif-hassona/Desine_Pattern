import java.util.*;
import java.io.*;
import java.time.*;


public class Main {
    public static void main(String[] args) {
      SmartHomeFacade smart=new SmartHomeFacade();
      smart.TurnOnMorningMode();
      System.out.println();
      smart.TurnOffAll();
    }
}