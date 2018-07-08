package wzorce.observer.sample_1;

import java.util.ArrayList;

public class TotoLotek implements Obserwowany{

    private ArrayList<Obserwator> obserwatorzy;
    private int[] wyniki;

    public TotoLotek() {
        obserwatorzy = new ArrayList<Obserwator>();
        wyniki = new int[]{0,0,0,0,0,0};
    }


    public void dodajObserwatora(Obserwator o) {
        obserwatorzy.add(o);
    }


    public void usunObserwatora(Obserwator o) {
        int index = obserwatorzy.indexOf(o);
        obserwatorzy.remove(index);

    }


    public void powiadamiajObserwatorow() {
        for (Obserwator o: obserwatorzy) {
            o.update(wyniki);
        }
    }

    public void kolejneLosowanie() {
        int i  = 0;
        while (i < 6) {
            boolean powtorka = false;
            double x = (Math.random()*47-1);
            for (int j = 0; j < 6; j++) {
                if (wyniki[j] == (int)x) {
                    powtorka = true;
                }
            }
            if(powtorka == false) {
                wyniki[i++] = (int)x;
            }
        }
        powiadamiajObserwatorow();
    }

    public int[] getResults() {
        return wyniki;
    }
}
