package wzorce.flyWeight.sample_1;

public abstract class Zmiana implements Posilek{

    Posilek posilek;

    protected Zmiana(Posilek posilek) {
        this.posilek = posilek;
    }

    public abstract String dajNazwe();

}
