package wzorce.command;

public class PelnyTrening implements Polecenie{

    Polecenie[] tab;

    public PelnyTrening(Polecenie[] tab) {
        this.tab = tab;
    }

    @Override
    public void wykonaj() {
        for (Polecenie p: tab) {
            p.wykonaj();
        }
    }

    @Override
    public void cofnij() {
        for (Polecenie p: tab) {
            p.cofnij();
        }
    }
}
