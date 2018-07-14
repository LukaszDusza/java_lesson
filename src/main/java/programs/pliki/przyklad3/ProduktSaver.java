package programs.pliki.przyklad3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProduktSaver {

    public static List<Product> readFromFileToArray(String filePath) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File(filePath));
        scanner.useDelimiter(";");

        List<Product> products = new ArrayList<>();

        while(scanner.hasNext()) {
            Product product = new Product();

            product.setId(scanner.nextLong());
            product.setName(scanner.next());
            product.setPrice(Double.valueOf(scanner.next()));
            product.setCategory(scanner.next());

            products.add(product);

            scanner.nextLine();

        }

        scanner.close();

        System.out.println("Products stored in ArrayList:");

        for(Product p: products) {
            System.out.println(p);
        }

        return products;
    }

    public static void writeFileFromArray(List<Product> products) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("newProducts.txt");

        for(Product p: products) {
            StringBuilder stringBuilder = new StringBuilder();
            printWriter
                    .print(stringBuilder
                    .append(p.getId())
                    .append(";")
                    .append(p.getName())
                    .append(";")
                    .append(p.getPrice())
                    .append(";")
                    .append(p.getCategory())
                    .append(";"));

             printWriter.println();
        }

        printWriter.close();

        System.out.println("Product exported to file.");
    }
}
