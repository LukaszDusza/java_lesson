package wzorce.decorator;

public class Klimatyzacja extends Decorator {

    Samochod samochod;

    public Klimatyzacja(Samochod samochod) {
        this.samochod = samochod;
    }

    @Override
    public String about() {
        return samochod.about() + " klimatyzacja ";
    }

    @Override
    public double cena() {
        return samochod.cena() + 3300;
    }
}
