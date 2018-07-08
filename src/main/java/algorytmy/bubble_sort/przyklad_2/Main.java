package algorytmy.bubble_sort.przyklad_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int[] tablica;

    public static void main(String[] args) throws java.io.IOException {
        System.out.println("Wpisz liczby które chcesz posortować oddzielone spacją:");

        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        StringTokenizer liczby = new StringTokenizer(reader.readLine());

// wstaw liczby do tablicy
        tablica = new int[liczby.countTokens()];
        for (int i=0;i<tablica.length;i++)
            tablica[i] = Integer.parseInt(liczby.nextToken());

        b_sort(tablica); // sortuj

// wyswietl posortowae liczby

        System.out.println("Posortowane liczby:");
        for (int liczba:tablica)
            System.out.print(liczba+" ");
    }

    public static void b_sort(int[] tablica)
    {
        int mniejszaLiczba = tablica.length-1; // indeks pierwszej porownywanej liczby; wartosc poczatkowa
        int wiekszaLiczba = mniejszaLiczba-1; // indeks drugiej porownywanej liczby; wartosc poczatkowa

        int tmp;
        while (wiekszaLiczba >= 0) // indeks drugiej porownywanej liczby musi byc nie mniejszy niz zero
        {
            if (tablica[wiekszaLiczba] > tablica[mniejszaLiczba]) // jesli druga liczba jest wieksza niz pierwsza
            {
                tmp = tablica[wiekszaLiczba];
                tablica[wiekszaLiczba] = tablica[mniejszaLiczba]; // zamien wartosci
                tablica[mniejszaLiczba] = tmp;

                mniejszaLiczba = tablica.length-1;  // zresetuj licznik
                wiekszaLiczba = mniejszaLiczba-1;   // zresetuj licznik
            }
            else // jesli druga liczba jest mniejsza lub rowna pierwszej, zmniejsz licznik o 1
            {
                mniejszaLiczba--;
                wiekszaLiczba--;
            }
        }
    }
}
