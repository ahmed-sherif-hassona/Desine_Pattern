public class CarFactory {
    public static Car getCar(String type)
    {
      if(type.equalsIgnoreCase("BMW"))
      {
          return new BMW();
      }
        else if(type.equalsIgnoreCase("Benz"))
        {
            return new Benz();
        }
     else  if(type.equalsIgnoreCase("Toyota"))
        {
            return new Toyota();
        }
        else {
            throw new IllegalArgumentException("Unknow car type "+ type);
        }

    }
}
