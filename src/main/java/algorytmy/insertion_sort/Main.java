package algorytmy.insertion_sort;


import java.util.Scanner;

public class Main {
    private static int tablica[];
    private static int ile_liczb;

    public static void main(String[] args) {

        int i,liczba;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ile liczb chesz posortowac.");
        ile_liczb = scanner.nextInt();
        tablica = new int[ile_liczb];
        for(i=0; i<ile_liczb; i++) {
            System.out.println("podaj " + (i + 1) + " liczbę: ");
            tablica[i] = scanner.nextInt();
        }

        System.out.println("Tablica przed posortowaniem:");
        for(i=0; i<ile_liczb; i++)
            System.out.println(tablica[i]);
        insertionsort(tablica,ile_liczb);
        System.out.println("Tablica po posortowaniu:");
        for(i=0; i<ile_liczb; i++)
            System.out.println(tablica[i]);
    }

    private static void insertionsort(int tablica[], int ile_liczb) {
        int i,j,v;

        for (i=1;i < ile_liczb; i++) {
            j = i;
            v = tablica[i];
            while ((j>0) && (tablica[j-1]>v)) {
                tablica[j]=tablica[j-1];
                j--;
            }
            tablica[j] = v;
        }
    }
}
