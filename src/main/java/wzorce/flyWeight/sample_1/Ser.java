package wzorce.flyWeight.sample_1;

public class Ser extends Zmiana{

    public Ser(Posilek posilek) {
        super(posilek);
    }

    @Override
    public String dajNazwe() {
        return posilek.dajNazwe() + " + ser";
    }
}
