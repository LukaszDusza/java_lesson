package wzorce.abstractFactory.procesor;

public class ProcesorDoPC implements Procesor {

    String name = "procesor do PC";

    @Override
    public Procesor dawajProcesor() {
        System.out.println("daje: " + name);
        return new ProcesorDoPC();
    }
}
