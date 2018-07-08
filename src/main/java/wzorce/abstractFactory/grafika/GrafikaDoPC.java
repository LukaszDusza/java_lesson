package wzorce.abstractFactory.grafika;

public class GrafikaDoPC implements Grafika {

    String name = "grafika do pc";

    @Override
    public Grafika dawajGrafike() {
        System.out.println("dodaje: " + name);
        return new GrafikaDoPC();
    }
}
