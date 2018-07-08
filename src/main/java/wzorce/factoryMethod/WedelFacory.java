package wzorce.factoryMethod;

public class WedelFacory  implements ChocolateFactory{

    @Override
    public Chocolate produceChocolate(ChocolateType type) {

        Chocolate chocolate = null;

        switch (type) {
            case DARK: {
                chocolate = new DarkChocolate();
                break;
            }
            case MILK: {
                chocolate = new MilkChocolate();
                break;
            }
            case WITH_NUTS: {
                chocolate = new NutsChocolate();
                break;
            }
        }
        return chocolate;
    }
}
