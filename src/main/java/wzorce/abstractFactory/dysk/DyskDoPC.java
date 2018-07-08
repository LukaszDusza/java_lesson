package wzorce.abstractFactory.dysk;

public class DyskDoPC implements Dysk {

    String name  = "dysk do peceta";


    @Override
    public Dysk dawajDysk() {
        System.out.println("dodaje: " + name);
        return new DyskDoPC();
    }
}
