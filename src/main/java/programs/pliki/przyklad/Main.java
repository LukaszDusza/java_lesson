package programs.pliki.przyklad;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            reader();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void reader() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/main/java/programs/pliki/file.txt"));

            StringBuilder sb = new StringBuilder();
        String line;
        try {
            line = br.readLine();
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            System.out.println(everything);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }


    }

}
