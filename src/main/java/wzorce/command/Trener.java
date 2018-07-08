package wzorce.command;

public class Trener {
    private Polecenie polecenie;

    public void setPolecenie(Polecenie polecenie) {
        this.polecenie = polecenie;
    }

    public void rozkaz() {
        polecenie.wykonaj();
    }

    public void cofnij() {
        polecenie.cofnij();
    }
}
