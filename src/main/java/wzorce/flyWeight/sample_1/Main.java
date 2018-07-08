package wzorce.flyWeight.sample_1;


//Pyłek (ang. flyweight) - strukturalny wzorzec projektowy.
// Stosowany do tworzenia bardzo dużej liczby obiektów (niewiele się różniących lub identycznych),
// którymi to będziemy mogli zarządzać (sterować) w sposób jednolity.
// Wzorzec tworzy jedną jedyną instancje danego obiektu.
// Wszystko opiera się na współdziałaniu,
// polegającym na modyfikacji atrybutów tego obiektu
// (przekazujemy do niego tylko to co uległo zmianie).
// Efektem takiej pracy jest znaczne zmniejszenie zapotrzebowania naszej aplikacji na pamięć
// (zamiast całej masy podobnych, jak nie identycznych, obiektów,
// przechowujemy tylko jedna instancję).
// Jedyną wadą stosowania tego wzorca jest spadek wydajności aplikacji.


//W rozwiązaniu tego wzorca tworzymy tylko unikatowe obiekty.
// W momencie tworzenia nowego obiektu, sprawdzane jest czy egzemplarz
// o takich samych parametrach istnieje już w pamięci. Jeśli tak,
// to pobieramy go, a jeśli nie, tworzymy nowy. Obiekty te są immutable (niezmienne),
// czyli przygotowujemy klasę tak aby nie dało się jej zmodyfikować.
// Natomiast, gdy zajdzie potrzeba zmiany danych wtedy tworzona jest nową instancja.
// Dzięki wykorzystaniu pyłku zmniejszamy ilość wykorzystywanej pamięci.
// Przykładem zastosowania tego wzorca jest obsługa obiektów typu String w JRE.

public class Main {

    public static void main(String[] args) {
        Posilek posilek = new Pizza();
        System.out.println(posilek.dajNazwe());
        posilek = new Sos(posilek);
        System.out.println(posilek.dajNazwe());
        posilek = new Ser(posilek);
        System.out.println(posilek.dajNazwe());
    }



}
