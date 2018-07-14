package programs.zgadnijLiczbę;

import java.util.Random;
import java.util.Scanner;

public class ZgadnijLiczbe {
    public static void main(String[] args) throws NumberFormatException {

        Scanner scanner = new Scanner(System.in);
        boolean wynik = false;
        int ktory_raz=1;
        Random rand = new Random();
        int liczba = rand.nextInt(100);
        while (wynik==false)
        {
            System.out.print("Wprowadź liczbę z zakresu 0-100: ");
            int zgadnij = scanner.nextInt();
            if(zgadnij==liczba)
            {
                System.out.println("Znalazłeś szukaną liczbę!!!");
                wynik=true;
            }
            else if (zgadnij>liczba)
            {
                System.out.println("Podałeś większą liczbę.");
                wynik=false;
                ktory_raz++;
            }
            else if (zgadnij<liczba)
            {
                System.out.println("Podałeś mniejszą liczbę.");
                wynik=false;
                ktory_raz++;
            }
        }
        System.out.println("Zgadłeś za "+ktory_raz+" razem.");
    }
}
