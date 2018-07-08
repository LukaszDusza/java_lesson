package wzorce.brige;

public class KPIPlytka extends Plytka {



    public KPIPlytka(PlytkaInterface plytkaInterface, Tlok type, String name) {
        super(plytkaInterface, type, name);
    }

    @Override
    public void akcja() {
        plytkaInterface.akcja();
    }
}
