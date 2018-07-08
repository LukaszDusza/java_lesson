package wzorce.decorator;

//Dekorator (ang. decorator) - wzorzec strukturalny, służy do ulepszania i rozbudowywania obiektów.
// Załóżmy, że chcemy dodać do jakiejś klasy metodę (niech jeszcze będzie to abstrakcja lub metoda wirtualna,
// a klasa ta będzie nadklasą dla innych klas). Dzięki dekoratorowi nie musimy tutaj nic modyfikować,
// możemy nadać obiektowi nowe zachowanie podczas działania programu. Dodatkowo wzorzec ten zapobiega
// przed eksplozją klas, spowodowaną dużą liczbą rozszerzeń danej klasy (np. kombinacji rożnych składników
// na pizzy może być mnóstwo!).
//Dekorator musi mieć taki sam interfejs jak obiekt, który będziemy dekorować
// (obiekty dekorujące są tego samego typu co obiekty dekorowane).
// Do dekoratora przekazujemy dekorowany obiekt.
// W przeciwieństwie do dziedziczenia, obiekty dostają nowe funkcjonalności dynamicznie
// ( w trakcie działania programu), a nie na etapie kompilacji. Klient wcale nie musi wiedzieć o działaniu wzorca.

public abstract class Samochod {
    protected String samochod  = "Samochod osobowy";

    public String about() {
        return samochod;
    }

    public abstract double cena();


}
