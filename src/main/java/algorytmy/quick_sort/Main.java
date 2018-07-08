package algorytmy.quick_sort;

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
        quicksort(tablica,0, ile_liczb-1);
        System.out.println("Tablica po posortowaniu:");
        for(i=0; i<ile_liczb; i++)
            System.out.println(tablica[i]);
    }



    private static void quicksort(int tablica[], int x, int y) {

        int i,j,v,temp;

        i=x;
        j=y;
        v=tablica[(x+y) / 2];
        do {
            while (tablica[i]<v)
                i++;
            while (v<tablica[j])
                j--;
            if (i<=j) {
                temp=tablica[i];
                tablica[i]=tablica[j];
                tablica[j]=temp;
                i++;
                j--;
            }
        }
        while (i<=j);
        if (x<j)
            quicksort(tablica,x,j);
        if (i<y)
            quicksort(tablica,i,y);
    }
}
