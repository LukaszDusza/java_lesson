package programs.pliki.przyklad1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Odczyt{
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/java/programs/pliki/file.txt");
        Scanner scanner = new Scanner(file);

        String zdanie1 = scanner.nextLine();
        System.out.println(zdanie1);

        String zdanie2 = scanner.nextLine();
        System.out.println(zdanie2);
    }
}