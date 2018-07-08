package wzorce.abstractFactory.produkt;

import wzorce.abstractFactory.fabryki.FabrykaPodzespolowDoLaptopa;

public class Laptop extends Komputer{

    FabrykaPodzespolowDoLaptopa fabrykaPodzespolowDoLaptopa;

    public Laptop(FabrykaPodzespolowDoLaptopa fabrykaPodzespolowDoLaptopa) {
        this.fabrykaPodzespolowDoLaptopa = fabrykaPodzespolowDoLaptopa;
        skladanie();
    }

    @Override
    public void skladanie() {
        dysk = fabrykaPodzespolowDoLaptopa.produkujemyDysk().dawajDysk();
        grafika = fabrykaPodzespolowDoLaptopa.produkujemyGrafike().dawajGrafike();
        procesor = fabrykaPodzespolowDoLaptopa.produkujmyProcesor().dawajProcesor();
        pamiec = fabrykaPodzespolowDoLaptopa.produkujemyPamiec().dawajPamiec();
    }
}
