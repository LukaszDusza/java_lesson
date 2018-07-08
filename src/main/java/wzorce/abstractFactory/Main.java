package wzorce.abstractFactory;


import wzorce.abstractFactory.produkt.Komputer;

//Fabryka abstrakcyjna (ang. abstract factory) - konstrukcyjny wzorzec projektowy.
// Fabryka pozwala tworzyć całe rodziny produktów.
// Mamy zdefiniowany interfejs do tworzenia spokrewnionych obiektów.
// Występuje tu kompozycja oraz pewne uzależnienie od abstrakcji,
// a nie klas rzeczywistych. Klient oddzielony jest od implementacji klas, tworzących obiekty.
// Wzorzec ten łączony jest z metodą fabrykującą.
//
//Mamy fabrykę komputerów. Produkujemy laptopy i komputery stacjonarne PC.
// Jak już napisałem wyżej wspomagamy się tutaj wzorcem zwanym metoda fabrykująca.
// Mamy tutaj główną klasę, klasę abstrakcyjną (po niej dziedziczą szczegółowe fabryki,
// np. na części do laptopów i części do komputerów PC). Szczegółowe fabryki produkują swoje podzespoły,
// tworzą nowe obiekty przy pomocy klas rzeczywistych. Klasy implementują odpowiadające im interfejsy.
// Teraz już tylko składamy komputery i wydajemy (metodo fabrykująca do dzieła!).

public class Main {

    public static void main(String[] args) {
        FabrykaKomputerow fabrykaKomputerow = new FabrykaKomputerow();

        System.out.println("PC");

        Komputer pc = fabrykaKomputerow.wydajKomputer("PC");

        System.out.println();
        Komputer laptop = fabrykaKomputerow.wydajKomputer("laptop");
    }

}
