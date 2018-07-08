package wzorce.factoryMethod;

public class NutsChocolate extends Chocolate {

    public NutsChocolate() {
        type = ChocolateType.WITH_NUTS;
    }

    protected void addKakao() {
        System.out.println("dodaje kakao");
    }
    protected void addMilk() {
        System.out.println("dodaje mleko.");
    }

    protected void addNuts() {
        System.out.println("dodaje orzechy.");
    }

    @Override
    public Chocolate getChocolate() {
        addMilk();
        addKakao();
        addNuts();
        return this; //zwraca tworzony obiekt.
    }

    @Override
    public String toString() {
        return "Czekolada Orzechowa";
    }
}
