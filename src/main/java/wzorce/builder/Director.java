package wzorce.builder;

public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public ZestawKomputerowy getZestaw() {
        return builder.getZestaw();
    }
    public void skladaj() {
        builder.newZestaw();
        builder.buildMonitor();
        builder.buildProcesor();
        builder.buildGrafika();
        builder.buildHdd();
        builder.buildRam();
    }
}
