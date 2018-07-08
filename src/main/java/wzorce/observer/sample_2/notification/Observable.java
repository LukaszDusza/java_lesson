package wzorce.observer.sample_2.notification;

public interface Observable {

    void registerObserver(Observer observer);
    void unregisteredObserver(Observer observer);
    void notifyObservers();
}
