package wzorce.abstractFactory.procesor;

public class ProcesorDoLaptopa implements Procesor{

    String name = "procesor do laptopa";


    @Override
    public Procesor dawajProcesor() {
        System.out.println("daje: " + name);
        return new ProcesorDoLaptopa();
    }
}
