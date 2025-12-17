public class objectAdapter implements Atarget{
    Adaptee adaptee;
    public objectAdapter(Adaptee adaptee)
    {
        this.adaptee=adaptee;
    }

    @Override
    public void request() {
        adaptee.specialRequest();
    }
}
