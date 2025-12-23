public class WhiteFactory implements  AnimalFactory{
    @Override
    public Animal GetDog() {
        return new WhiteDog();
    }

    @Override
    public Animal GetCat() {
        return new WhiteCat();
    }
}
