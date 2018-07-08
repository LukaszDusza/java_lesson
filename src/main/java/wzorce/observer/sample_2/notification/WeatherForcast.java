package wzorce.observer.sample_2.notification;

import java.util.HashSet;
import java.util.Set;

public class WeatherForcast implements Observable {

    private int temperature;
    private int pressure;

    private Set<Observer> registeredObservers = new HashSet<>();



    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }


    public void unregisteredObserver(Observer observer) {
     registeredObservers.remove(observer);
    }


    public void notifyObservers() {
        for(Observer o: registeredObservers) {
            o.updateForecast(this);
        }

    }

    public void updateForecast(int temperature, int pressure){
        setTemperature(temperature);
        setPressure(pressure);
        notifyObservers();
    }


    public WeatherForcast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;

    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public Set<Observer> getRegisteredObservers() {
        return registeredObservers;
    }

    public void setRegisteredObservers(Set<Observer> registeredObservers) {
        this.registeredObservers = registeredObservers;
    }
}


