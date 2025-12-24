import java.util.HashMap;

public class BirdFactory {
    private static final HashMap<String,Bird> angryBird=new HashMap<>();

   public static Bird GetBird(String color)
   {
       AngryBird bird= (AngryBird) angryBird.get(color);
       if(bird==null)
       {
           bird=new AngryBird(color);
           angryBird.put(color,bird);
           System.out.println("creating angry bird with "+color +" color");
       }
       return bird;
   }
}
