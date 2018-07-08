package wzorce.builder;

//Budowniczy (ang. builder)
//- wzorzec ten stosowany jest do konstruowania obiektów poprzez wcześniejsze stworzenie jego fragmentów.
// Składamy od szczegółu do ogółu (np. budowanie domu). Obiekty mogą być rozmaitych postaci,
// a wszystko opiera się na jednym procesie konstrukcyjnym. W konkretnych budowniczych decydujemy o tym,
// jak dany obiekt jest tworzony. Na koniec wywołujemy wszystkie metody poszczególnych budowniczych
// i otrzymujemy obiekt końcowy. Wzorzec ten często występuje z wzorcami fabryki oraz kompozytu.

public class ZestawKomputerowy {

    private String monitor;
    private String procesor;
    private String grafika;
    private String ram;
    private String hdd;

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public void setGrafika(String grafika) {
        this.grafika = grafika;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public void show() {
        if(monitor!=null) System.out.println("Monitor = " + monitor);
        if(procesor!=null) System.out.println("Procesor = " + procesor);
        if(grafika!=null) System.out.println("Grafika = " + grafika);
        if(ram!=null) System.out.println("RAM = " + ram);
        if(hdd!=null) System.out.println("HDD = " + hdd);
    }
}
