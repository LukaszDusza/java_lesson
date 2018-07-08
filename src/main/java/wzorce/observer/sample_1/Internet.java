package wzorce.observer.sample_1;

public class Internet implements Obserwator, Media{

    private int[] wyniki;
    private TotoLotek totoLotek;

    public Internet(TotoLotek totoLotek) {
        wyniki = new int[6];
        this.totoLotek = totoLotek;
    }


    public void informuj() {
        System.out.print("losowanie w internecie: ");
        for (int i: wyniki) {
            System.out.print(i + " ");
        }
    }


    public void update(int[] table) {
        for (int i = 0; i < 6; i++) {
            wyniki[i] = table[i];
        }
    }

    public void usun() {
        totoLotek.usunObserwatora(this);
    }
}
