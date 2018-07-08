package wzorce.decorator;

public class OponyZimowe extends Decorator{

    Samochod samochod;

    public OponyZimowe(Samochod samochod) {
        this.samochod = samochod;
    }

    @Override
    public String about() {
        return samochod.about() + " plus opony zimowe ";
    }

    @Override
    public double cena() {
        return samochod.cena() + 3000;
    }

}
