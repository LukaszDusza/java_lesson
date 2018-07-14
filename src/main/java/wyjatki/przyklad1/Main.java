package wyjatki.przyklad1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        userConsole();
    }

    public static void userConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj maks 5 liczb.");

        boolean flag = true;
        List<Integer> numbers = new ArrayList<>();
        int counter = 0;

        while(flag) {
            flag = false;
            System.out.println("Dodać liczbę? T/N");
            String s = scanner.next();
            switch (s.toUpperCase()) {
                case "T":
                    counter++;
                    flag = true;
                    System.out.print("podaj: " + counter + " liczbę: ");
                    try {
                        numbers.add(scanner.nextInt());
                    } catch (InputMismatchException e) {
                        System.err.println("Podaj liczby zamiast liter!");
                        userConsole();
                    }

                    break;
                case "N":
                    if(numbers.size() > 0) {
                        flag = false;
                        try {
                            fiveIndexTab(numbers.toArray());
                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.err.println("Podaj maksymalnie 5 liczb!");
                            userConsole();
                        }  finally {
                            System.out.println("Sprzątam po skończonej pracy.");
                            scanner.close();
                            numbers.clear();
                        }
                    } else {
                        System.out.println("Nie podałeś liczb. Program kończy pracę.");
                    }
                    break;
            }
        }

    }


    public static int[] fiveIndexTab (Object[] numbers) {
        int[] tab = new int[5];

            for(int i = 0; i < numbers.length; i++) {
                tab[i] = (int) numbers[i];
                System.out.print(tab[i] + " | ");
            }
            return tab;

    }



}
