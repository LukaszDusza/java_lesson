package wzorce.flyWeight.sample_2;


// wzorzec strukturalny, który przydaje się w aplikacjach,
// które korzystają z większej liczby identycznych obiektów.
//W rozwiązaniu tego wzorca tworzymy tylko unikatowe obiekty.
// W momencie tworzenia nowego obiektu, sprawdzane jest czy egzemplarz
// o takich samych parametrach istnieje już w pamięci. Jeśli tak, to pobieramy go,
// a jeśli nie, tworzymy nowy. Obiekty te są immutable (niezmienne),
// czyli przygotowujemy klasę tak aby nie dało się jej zmodyfikować.
// Natomiast gdy zajdzie potrzeba zmiany danych wtedy tworzona jest nową instancja.
// Dzięki wykorzystaniu pyłku zmniejszamy ilość wykorzystywanej pamięci.
// Przykładem zastosowania tego wzorca jest obsługa obiektów typu String w JRE.

public class Main {

//  Wywołujemy w pętli tworzenie obiektów w naszej fabryce pyłków.

//  Pomimo 100 wywołań tworzenia obiektu, obiekt tworzy się tylko raz.
// W pozostałych 99 przypadkach pobierany jest utworzony już obiekt.

    public static void main(String[] args) throws InterruptedException {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        for(int i = 0; i < 100; i++) {
            flyweightFactory.createRelation("relation1 + relation2");
        }
    }
}
