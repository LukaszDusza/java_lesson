package wzorce.observer.sample_2.observators;

import wzorce.observer.sample_2.notification.Observer;
import wzorce.observer.sample_2.notification.WeatherForcast;

public class TvNews  implements Observer {
    @Override
    public void updateForecast(WeatherForcast weatherForcast) {
        System.out.println("TV: \n aktalna pogoda: \n + temaratura: " + weatherForcast.getTemperature()
                + "C \n, ciśnienie: " + weatherForcast.getPressure() + " hpa");
    }
    }

