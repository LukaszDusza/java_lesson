package wzorce.abstractFactory.pamiec;

public class PamiecDoLaptopa implements Pamiec{

    String name = "pamiec do laptopa";

    @Override
    public Pamiec dawajPamiec() {
        System.out.println("daje: " + name);
        return new PamiecDoLaptopa();
    }
}
