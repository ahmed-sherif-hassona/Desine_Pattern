public class SmartHomeFacade {
    private AC ac;
    private Lights lights;
    private SoundSystem sound;
    SmartHomeFacade()
    {
        ac=new AC();
        lights=new Lights();
        sound=new SoundSystem();
    }

    public void TurnOnMorningMode()
    {
        ac.TurnOn();
        lights.TurnOn();
        sound.TurnOn();
    }

    public void TurnOffAll()
    {
        ac.TurnOff();
        lights.TurnOff();
        sound.TurnOff();
    }
}
