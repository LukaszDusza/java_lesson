package wzorce.builder;

public class ZestawXXSpectrum extends Builder {
    @Override
    public void buildMonitor() {
        zestawKomputerowy.setMonitor("Benq 28cali");
    }

    @Override
    public void buildProcesor() {
        zestawKomputerowy.setProcesor("Intel i9");
    }

    @Override
    public void buildGrafika() {
        zestawKomputerowy.setGrafika("GTX 10180TI");
    }

    @Override
    public void buildRam() {
     zestawKomputerowy.setRam("Corsair");
    }

    @Override
    public void buildHdd() {
        zestawKomputerowy.setHdd("WD Caviar");
    }
}
