package wzorce.command;

public class Plywanie implements Polecenie{

    private Zawodnik zawodnik;

    public Plywanie(Zawodnik zawodnik) {
        this.zawodnik = zawodnik;
    }

    @Override
    public void wykonaj() {
        zawodnik.zacznijPlywac();
    }

    @Override
    public void cofnij() {
        zawodnik.przestanPlywac();
    }
}
