package wzorce.strategy;

public class Samochod implements Dojezdzac{
    @Override
    public void dojezdzaj() {
        System.out.println("Dojazd: samochod");
    }
}
