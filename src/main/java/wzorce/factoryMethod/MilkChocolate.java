package wzorce.factoryMethod;

public class MilkChocolate extends Chocolate {

    public MilkChocolate() {
        type = ChocolateType.MILK;
    }

    protected void addMilk() {
        System.out.println("dodaje mleko");
    }

    protected void addKakao() {
        System.out.println("dodaje kakao");
    }


    @Override
    public Chocolate getChocolate() {
        addKakao();
        addMilk();
        return this;
    }

    @Override
    public String toString() {
        return "Czekolada Mleczna";
    }
}
