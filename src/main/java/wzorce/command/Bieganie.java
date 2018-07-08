package wzorce.command;

public class Bieganie implements Polecenie {

    private Zawodnik zawodnik; //obiekt wykonujacy.

    public Bieganie(Zawodnik zawodnik) {
        this.zawodnik = zawodnik;
    }

    @Override
    public void wykonaj() {
        zawodnik.zacznijBiegac();
    }

    @Override
    public void cofnij() {
        zawodnik.przestanBiegac();
    }
}
