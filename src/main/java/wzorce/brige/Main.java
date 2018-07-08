package wzorce.brige;


//Most (ang. bridge) - strukturalny wzorzec projektowy. Pozwala na modyfikowanie implementacji oraz abstrakcji
// w czasie działania programu. Interfejs zostaje całkowicie odizolowany od swojej implementacji.
// Dzięki temu zyskujemy możliwość oddzielnego modyfikowania abstrakcji oraz oddzielnej modyfikacji implementacji.
// Przydatny może być w sytuacji, gdy graficzny interfejs użytkownika (GUI) musi wyglądać inaczej w zależności
// od posiadanego systemu operacyjnego. Zmiany w kodzie mają charakter dynamiczny (wszystkie modyfikacje dokonywane
// są w trakcie działania programu). Dodatkowo wzorzec ten może służyć do odseparowania klienta
// od implementacji określonego interfejsu.

public class Main {

    public static void main(String[] args) {
        Plytka ob1 = new KPIPlytka(new Nagrywanie(), Tlok.dvd, "TDK");
        Plytka ob2 = new KPIPlytka(new Odczytywanie(), Tlok.cd, "Verbatim");
        ob1.akcja();
        System.out.println(ob1.get());
        ob2.akcja();
        System.out.println(ob2.get());
        ob1.set("Dysan", Tlok.bd);
        ob1.akcja();
        System.out.println(ob1.get());

    }

}
