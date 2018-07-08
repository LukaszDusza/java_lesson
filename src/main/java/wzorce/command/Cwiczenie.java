package wzorce.command;

public class Cwiczenie implements Polecenie {

    private Zawodnik zawodnik;

    public Cwiczenie(Zawodnik zawodnik) {
        this.zawodnik = zawodnik;
    }

    @Override
    public void wykonaj() {
        zawodnik.zacznijCwiczyc();
    }

    @Override
    public void cofnij() {
        zawodnik.przestanCwiczyc();
    }
}
