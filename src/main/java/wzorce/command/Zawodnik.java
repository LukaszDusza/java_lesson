package wzorce.command;

public class Zawodnik {
    private String id;

    public Zawodnik(String id) {
        this.id = id;
    }

    public void zacznijBiegac() {
        System.out.println("zawodnik " + id + " biega");
    }

    public void przestanBiegac() {
        System.out.println("zawodnik " + id + " przestal biegac");
    }

    public void zacznijPlywac() {
        System.out.println("zawodnik " + id + " plywa");
    }

    public void przestanPlywac() {
        System.out.println("zawodnik " + id + " przestal plywac");
    }

    public void zacznijCwiczyc() {
        System.out.println("zawodnik " + id + " cwiczy");
    }
    public void przestanCwiczyc() {
        System.out.println("zawodnik " + id + " przestal cwiczyc");
    }
}
