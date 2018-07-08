package wzorce.strategy;

public class Rower implements Dojezdzac{
    @Override
    public void dojezdzaj() {
        System.out.println("Dojazd: Rower");
    }
}
