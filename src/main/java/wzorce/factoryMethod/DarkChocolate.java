package wzorce.factoryMethod;

public class DarkChocolate extends Chocolate {

    public DarkChocolate() {
        type = ChocolateType.DARK;
    }

    protected void addKakao() {
        System.out.println("dodaje kakao");
    }

    @Override
    public Chocolate getChocolate() {
        addKakao();
        return this;
    }

    @Override
    public String toString() {
        return "DarkChocolate{" +
                "type=" + type +
                '}';
    }
}
