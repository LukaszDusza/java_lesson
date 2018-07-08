package wzorce.command;

//Polecenie (ang. command) - czynnościowy wzorzec projektowy.
// Jego celem jest enkapsulacja żądań użytkownika (wraz z ich parametrami)
// do postaci obiektów, które nazywamy poleceniami.
//Obiekty te muszą być podporządkowane pod ten sam interfejs,
// zawierający jedną metodę, wykonującą określone żądanie, ale czy tylko jedno? Oczywiście,
// że nie, co widać w załączonym przykładzie (multicasting), tam odpalamy aż trzy żądania.
// Dodatkowo mamy obiekt wywołujący (rozkazujący) oraz pewną liczbę odbiorców, przyjmujących
// i realizujących zlecone polecenia. Nie wiemy kto i jakie operacje wykonuje.
//Czasami też taki interfejs posiada dodatkową metodę, która cofa ostatnio wykonane żądanie,
// przywracając poprzedni porządek. Wraz z multicastingiem, mamy tutaj potężny mechanizm odzyskiwania
// poprzedniego stanu. Jest to idealne narzędzie do tworzenia jakichkolwiek transakcji oraz rejestrów.
// Metody mogą być wywoływane synchronicznie (stosowane do różnego rodzaju kolejek żądań)
// lub asynchronicznie (równolegle, przy pomocy wielowątkowości).


public class Main {

    public static void main(String[] args) {

        Trener trener = new Trener();
        Zawodnik zawodnik1 = new Zawodnik("Ania");
        Zawodnik zawodnik2 = new Zawodnik("Zbyszek");
        Zawodnik zawodnik3 = new Zawodnik("Michal");

        Bieganie bieganie = new Bieganie(zawodnik1);
        Plywanie plywanie = new Plywanie(zawodnik2);

        trener.setPolecenie(bieganie);
        trener.rozkaz();

        trener.setPolecenie(plywanie);
        trener.rozkaz();

        trener.cofnij();

        System.out.println();

        Polecenie[] tab = {new Cwiczenie(zawodnik3), new Bieganie(zawodnik1), new Plywanie(zawodnik2)};
        PelnyTrening pelnyTrening = new PelnyTrening(tab);

        trener.setPolecenie(pelnyTrening);
        trener.rozkaz();

    }
            }
