package wzorce.abstractFactory;

import wzorce.abstractFactory.fabryki.FabrykaPodzespolowDoLaptopa;
import wzorce.abstractFactory.fabryki.FabrykaPodzespolowPC;
import wzorce.abstractFactory.produkt.Komputer;
import wzorce.abstractFactory.produkt.KomputerPC;
import wzorce.abstractFactory.produkt.Laptop;

public class FabrykaKomputerow {

    public Komputer wydajKomputer(String model) {
        Komputer komputer = zlozKomputer(model);
        komputer.instalowanieOprogramowania();
        komputer.pakowanie();
        komputer.sprzedawanie();
        return komputer;
    }

    protected Komputer zlozKomputer(String model) {
        Komputer komputer = null;

        if(model.equalsIgnoreCase("PC")) {
            komputer = new KomputerPC(new FabrykaPodzespolowPC());
        } else if(model.equalsIgnoreCase("Laptop")) {
            komputer = new Laptop(new FabrykaPodzespolowDoLaptopa());
        }
        return komputer;
    }

}
