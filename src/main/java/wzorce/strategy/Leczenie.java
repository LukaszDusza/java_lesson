package wzorce.strategy;

public class Leczenie implements Pracowac{
    @Override
    public void pracuj() {
        System.out.println("Praca: leczy ludzi.");
    }
}
