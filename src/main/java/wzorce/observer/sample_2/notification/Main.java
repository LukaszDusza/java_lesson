package wzorce.observer.sample_2.notification;


import wzorce.observer.sample_2.observators.InternetNews;
import wzorce.observer.sample_2.observators.RadioNews;
import wzorce.observer.sample_2.observators.TvNews;

public class Main {

    public static void main(String[] args) {

        WeatherForcast weatherForcast = new WeatherForcast(23, 1004);

        TvNews tvNews = new TvNews();
        InternetNews internetNews = new InternetNews();
        RadioNews radioNews = new RadioNews();

        //rejestracja obserwatorów
        weatherForcast.registerObserver(tvNews);
        weatherForcast.registerObserver(internetNews);
        weatherForcast.registerObserver(radioNews);

        weatherForcast.notifyObservers();

        System.out.println("----------------------------------------");

        weatherForcast.unregisteredObserver(tvNews);

        weatherForcast.updateForecast(19, 996);

    }
}
