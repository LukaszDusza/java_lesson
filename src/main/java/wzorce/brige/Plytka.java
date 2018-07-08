package wzorce.brige;

public abstract class Plytka {

    protected PlytkaInterface plytkaInterface;
    protected Tlok type;
    protected String name;

    public Plytka(PlytkaInterface plytkaInterface, Tlok type, String name) {
        this.plytkaInterface = plytkaInterface;
        this.type = type;
        this.name = name;
    }

    public String get() {
        return name + " " + type;
    }

    public void set(String name, Tlok type) {
        this.name = name;
        this.type = type;
    }

    public abstract void akcja();

}
