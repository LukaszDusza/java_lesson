package wzorce.builder;

public abstract class Builder {

    protected ZestawKomputerowy zestawKomputerowy;

    public void newZestaw() {
        zestawKomputerowy = new ZestawKomputerowy();
    }

    public ZestawKomputerowy getZestaw() {
        return zestawKomputerowy;
    }

    public abstract void buildMonitor();
    public abstract void buildProcesor();
    public abstract void buildGrafika();
    public abstract void buildRam();
    public abstract void buildHdd();




}
