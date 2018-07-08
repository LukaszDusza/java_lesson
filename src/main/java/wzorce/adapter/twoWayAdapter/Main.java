package wzorce.adapter.twoWayAdapter;

public class Main {


    //Wzorzec adapter (znany także pod nazwą wrapper) służy do przystosowania interfejsów obiektowych,
    // tak aby możliwa była współpraca obiektów o niezgodnych interfejsach.
    // Szczególnie przydaje się przypadku wykorzystania gotowych bibliotek
    // o interfejsach niezgodnych ze stosowanymi w aplikacji.
    // W świecie rzeczywistym adapter to przejściówka,
    // np. przejściówka do wtyczki gniazdka angielskiego na polskie.

    public static void main(String[] args) {

        //adapter dwukierunkowy

        ContinentalSocket continentalSocket = new ContinentalSocket();
        UKSocket ukSocket = new UKSocket();

        ContinentalDevice radioUE = new ContinentalDevice() {
            @Override
            public void poweOnEuropeSocket() {
                System.out.println("Radio gra po polsku");
            }
        };

        UKDevice radioUK = new UKDevice() {
            @Override
            public void powerOnUKSocket() {
                System.out.println("radio plays english music");
            }
        };

        TwoWayAdapter adapter = new TwoWayAdapter(radioUK, radioUE);

        //odpalamy na gniazdku UE
        continentalSocket.plugIn(adapter);

        // na gniazdku UK
        ukSocket.plugIn(adapter);

    }





}
