public interface subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();

}
