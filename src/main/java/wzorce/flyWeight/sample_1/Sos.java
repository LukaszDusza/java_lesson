package wzorce.flyWeight.sample_1;

public class Sos extends Zmiana{

    public Sos(Posilek posilek) {
        super(posilek);
    }

    @Override
    public String dajNazwe() {
        return posilek.dajNazwe() + " + sos";
    }
}
