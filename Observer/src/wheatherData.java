import java.util.ArrayList;
import java.util.List;

public class wheatherData implements subject
{
   private List<Observer>observers;
    private float temperature;
   private float humidity;

   public wheatherData()
   {
       observers=new ArrayList<>();
   }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(var o :observers)
        {
            o.Update(temperature,humidity);
        }
    }

    void setTemperature(float temperature,float humidity)
    {
        this.temperature=temperature;
        this.humidity=humidity;
        notifyObservers();
    }
}
