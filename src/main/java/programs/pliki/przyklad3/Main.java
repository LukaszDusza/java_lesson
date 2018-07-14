package programs.pliki.przyklad3;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        try {
            List<Product> productList = ProduktSaver.readFromFileToArray("products.txt");

            ProduktSaver.writeFileFromArray(productList);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
