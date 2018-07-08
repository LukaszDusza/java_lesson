package wzorce.abstractFactory.dysk;

public class DyskDoLaptopa implements Dysk {

    String name = "dysk do laptopa";

    @Override
    public Dysk dawajDysk() {
        System.out.println("dodaje: " + name);
        return new DyskDoLaptopa();
    }
}
