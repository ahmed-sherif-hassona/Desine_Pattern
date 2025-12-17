public class Client  {
    Atarget atarget;
    public Client(Atarget atarget)
    {
        this.atarget=atarget;
    }

    public void Upwork()
    {
        atarget.request();
    }
}
