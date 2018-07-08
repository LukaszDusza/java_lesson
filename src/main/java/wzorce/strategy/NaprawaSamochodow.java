package wzorce.strategy;

class NaprawaSamochodow implements Pracowac{

    @Override
    public void pracuj() {
        System.out.println("Praca: naprawa samochodu");
    }
}
