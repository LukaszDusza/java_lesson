package algorytmy.selection_sort;

import java.util.Scanner;

public class Main {

    private static int tablica[];
    private static int ile_liczb;

    public static void main(String[] args) {

        int i,liczba;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ile liczb chesz posortowac?");
        ile_liczb = scanner.nextInt();
        tablica = new int[ile_liczb];
        for(i=0; i<ile_liczb; i++) {
            System.out.println("wprowadź " + (i+1) + " liczbę: ");
            tablica[i] = scanner.nextInt();
        }

        System.out.println("Tablica przed posortowaniem:");
        for(i=0; i<ile_liczb; i++)
            System.out.println(tablica[i]);
        selectionsort(tablica,ile_liczb);
        System.out.println("Tablica po posortowaniu:");
        for(i=0; i<ile_liczb; i++)
            System.out.println(tablica[i]);
    }

    private static void selectionsort(int tablica[], int ile_liczb) {
        int min,i,j,temp;

        for (i=0;i<ile_liczb-1;i++)  {
            min=i;
            for (j=i+1;j<ile_liczb;j++)
                if (tablica[j]<tablica[min])
                    min=j;
            temp=tablica[min];
            tablica[min]=tablica[i];
            tablica[i]=temp;
        }
    }
}
