package wzorce.abstractFactory.fabryki;

import wzorce.abstractFactory.dysk.Dysk;
import wzorce.abstractFactory.dysk.DyskDoLaptopa;
import wzorce.abstractFactory.grafika.Grafika;
import wzorce.abstractFactory.grafika.GrafikaDoLaptopa;
import wzorce.abstractFactory.pamiec.Pamiec;
import wzorce.abstractFactory.pamiec.PamiecDoLaptopa;
import wzorce.abstractFactory.procesor.Procesor;
import wzorce.abstractFactory.procesor.ProcesorDoLaptopa;

public class FabrykaPodzespolowDoLaptopa implements FabrykaPozespolowKomputerowych {


    @Override
    public Dysk produkujemyDysk() {
        return new DyskDoLaptopa();
    }

    @Override
    public Grafika produkujemyGrafike() {
        return new GrafikaDoLaptopa();
    }

    @Override
    public Pamiec produkujemyPamiec() {
        return new PamiecDoLaptopa();
    }

    @Override
    public Procesor produkujmyProcesor() {
        return new ProcesorDoLaptopa();
    }
}
