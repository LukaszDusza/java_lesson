package wzorce.abstractFactory.produkt;

import wzorce.abstractFactory.dysk.Dysk;
import wzorce.abstractFactory.grafika.Grafika;
import wzorce.abstractFactory.pamiec.Pamiec;
import wzorce.abstractFactory.procesor.Procesor;

public abstract class Komputer {
    Dysk dysk;
    Grafika grafika;
    Pamiec pamiec;
    Procesor procesor;

    public abstract void skladanie();

    public void instalowanieOprogramowania() {
        System.out.println("instaluje Windowsa...");
    }

    public  void pakowanie() {
        System.out.println("Pakuje komputer...");
    }

    public void sprzedawanie() {
        System.out.println("Sprzedaje komputer...");
    }
}
