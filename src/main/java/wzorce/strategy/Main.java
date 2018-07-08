package wzorce.strategy;

import java.util.Scanner;

//Strategia (ang. Strategy) jest czynnościowym wzorcem projektowym,
// będącym tak naprawdę pewną rodziną algorytmów. Algorytmy te upakowane są w oddzielne,
// w pełni wymienne (w trakcie działania programu) klasy. Na samej górze znajduje się klasa kontekstowa,
// wybierająca, który algorytm (ale tylko jeden!) będzie wykonywany.
// Dodawanie nowych algorytmów sprowadza się do stworzenia nowej klasy implementującej dany interfejs.
// Modyfikacja algorytmu to tylko modyfikacja odpowiedniej klasy.
// Mamy tutaj odseparowanie wyboru algorytmu od jego implementacji
// (sam klient nawet nie wie jak zbudowana jest dana strategia).
// Często występuje z wzorcem fabryki.

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj zawod:");
        String zawod = in.nextLine();

        try {
            Pracownik pracownik = new Pracownik(zawod);
            pracownik.methods();
        } catch (Exception e) {
            System.out.println("nie ma takie zawodu");
        }
    }


}
