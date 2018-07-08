package wzorce.abstractFactory.grafika;

public class GrafikaDoLaptopa implements Grafika {

    String name = "grafika do laptopa";


    @Override
    public Grafika dawajGrafike() {
        System.out.println("dodaje: " + name);
        return new GrafikaDoLaptopa();
    }
}
