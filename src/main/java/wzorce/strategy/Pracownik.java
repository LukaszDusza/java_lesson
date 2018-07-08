package wzorce.strategy;

public class Pracownik {
    private Pracowac pracowac;
    private Dojezdzac dojezdzac;
    private SpedzanieWolnegoCzasu spedzanieWolnegoCzasu;

    public Pracownik (String zawod) {
        if(zawod.equalsIgnoreCase("lekarz")) {
            pracowac = new Leczenie();
            dojezdzac = new Samochod();
            spedzanieWolnegoCzasu = new LiteraturaPopularnoNaukowa();
        } else if (zawod.equalsIgnoreCase("mechanik")) {
            pracowac = new NaprawaSamochodow();
            dojezdzac = new Rower();
            spedzanieWolnegoCzasu = new Silownia();
        } else if (zawod.equalsIgnoreCase("listonosz")) {
            pracowac = new RoznoszenieListow();
            dojezdzac = new Samochod();
            spedzanieWolnegoCzasu = new LiteraturaPopularnoNaukowa();
        }
    }

    public void methods() {
        pracowac.pracuj();
        dojezdzac.dojezdzaj();
        spedzanieWolnegoCzasu.spedzajWolnyCzas();
    }

}
