package wzorce.abstractFactory.fabryki;

import wzorce.abstractFactory.dysk.Dysk;
import wzorce.abstractFactory.grafika.Grafika;
import wzorce.abstractFactory.pamiec.Pamiec;
import wzorce.abstractFactory.procesor.Procesor;

public interface FabrykaPozespolowKomputerowych {

    Dysk produkujemyDysk();
    Grafika produkujemyGrafike();
    Pamiec produkujemyPamiec();
    Procesor produkujmyProcesor();

}
