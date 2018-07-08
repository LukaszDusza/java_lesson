package wzorce.abstractFactory.pamiec;

public class PamiecRamDoPC implements Pamiec {

    String name = "Pamiec do PC";

    @Override
    public Pamiec dawajPamiec() {
        System.out.println("daje: " + name);
        return new PamiecRamDoPC();
    }
}
