package wzorce.factoryMethod;

public class Main {

    public static void main(String[] args) {
        ChocolateFactory factory = new WedelFacory();
        Chocolate chocolateMilk = factory.produceChocolate(ChocolateType.MILK);
        Chocolate chocolateDark = factory.produceChocolate(ChocolateType.DARK);
        Chocolate chocolateNuts = factory.produceChocolate(ChocolateType.WITH_NUTS);

        System.out.println(chocolateDark.getChocolate());


        System.out.println(chocolateMilk.getChocolate());
        System.out.println(chocolateNuts.getChocolate());
    }

}
