package wzorce.builder;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ZestawXXSpectrum();


        director.setBuilder(builder);
        director.skladaj();
        ZestawKomputerowy zestaw = director.getZestaw();

        zestaw.show();
    }
}
