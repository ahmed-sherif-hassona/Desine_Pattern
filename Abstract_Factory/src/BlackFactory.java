public class BlackFactory implements AnimalFactory{
    @Override
    public Animal GetCat() {
        return new BlackCat();
    }

    @Override
    public Animal GetDog() {
        return new BlackDog();
    }
}
