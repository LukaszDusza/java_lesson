package wzorce.abstractFactory.fabryki;

import wzorce.abstractFactory.dysk.Dysk;
import wzorce.abstractFactory.dysk.DyskDoPC;
import wzorce.abstractFactory.grafika.Grafika;
import wzorce.abstractFactory.grafika.GrafikaDoPC;
import wzorce.abstractFactory.pamiec.Pamiec;
import wzorce.abstractFactory.pamiec.PamiecRamDoPC;
import wzorce.abstractFactory.procesor.Procesor;
import wzorce.abstractFactory.procesor.ProcesorDoPC;

public class FabrykaPodzespolowPC implements FabrykaPozespolowKomputerowych{
    @Override
    public Dysk produkujemyDysk() {
        return new DyskDoPC();
    }

    @Override
    public Grafika produkujemyGrafike() {
        return new GrafikaDoPC();
    }

    @Override
    public Pamiec produkujemyPamiec() {
        return new PamiecRamDoPC();
    }

    @Override
    public Procesor produkujmyProcesor() {
        return new ProcesorDoPC();
    }
}
