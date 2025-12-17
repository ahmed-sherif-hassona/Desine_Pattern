public class CurrentConditionDisplay implements Observer{
    private float temperature;
    private float humidity;

    @Override
    public void Update(float temperature, float humidity) {
        this.humidity=humidity;
        this.temperature=temperature;
       display();
    }

    void display()
    {
        System.out.println("current condition : "+temperature+"c, " + humidity +"%");
    }
}
