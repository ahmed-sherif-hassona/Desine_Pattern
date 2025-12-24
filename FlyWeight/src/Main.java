import java.util.*;
import java.io.*;
import java.time.*;


public class Main {
    private static final String colors[]={"Red","Blue","Orange"};
    public static void main(String[] args) {

        for (int i=0;i<colors.length;i++)
        {
            AngryBird angryBird= (AngryBird) BirdFactory.GetBird(colors[i]);
            angryBird.draw();
        }
    }
}

