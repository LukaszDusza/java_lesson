package wzorce.abstractFactory.produkt;

import wzorce.abstractFactory.fabryki.FabrykaPodzespolowPC;

public class KomputerPC extends Komputer{

    FabrykaPodzespolowPC fabrykaPodzespolowPC;

    public KomputerPC(FabrykaPodzespolowPC fabrykaPodzespolowPC) {
        this.fabrykaPodzespolowPC = fabrykaPodzespolowPC;
        skladanie();
    }

    @Override
    public void skladanie() {
        dysk = fabrykaPodzespolowPC.produkujemyDysk().dawajDysk();
        grafika = fabrykaPodzespolowPC.produkujemyGrafike().dawajGrafike();
        procesor = fabrykaPodzespolowPC.produkujmyProcesor().dawajProcesor();
        pamiec = fabrykaPodzespolowPC.produkujemyPamiec().dawajPamiec();
    }
}
