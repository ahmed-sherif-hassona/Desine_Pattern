import java.util.*;
import java.io.*;
import java.time.*;


public class Main {
    public static void main(String[] args) {
        AnimalFactory af1 = new BlackFactory();
        Animal cat = af1.GetCat();
        cat.ItsAnimal(); // i am a black cat
        Animal dog = af1.GetDog();
        dog.ItsAnimal(); // i am a black dog

        AnimalFactory af2 = new WhiteFactory();
        Animal cat1 = af2.GetCat();
        cat1.ItsAnimal(); // i am a white cat
        Animal dog1 = af2.GetDog();
        dog1.ItsAnimal(); // i am a white dog
    }
}

