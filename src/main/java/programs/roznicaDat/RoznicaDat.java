package programs.roznicaDat;

import sun.util.calendar.BaseCalendar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;


public class RoznicaDat {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Podaj pierwszą datę: ");
        String dane = reader.readLine();
        int dzien1 = Integer.parseInt(dane.substring(0, 2));
        int miesiac1 = Integer.parseInt(dane.substring(3, 5)) - 1;
        int rok1 = Integer.parseInt(dane.substring(6, 10)) - 1900;

        Date data1 = new Date(rok1, miesiac1, dzien1);
        System.out.print("Podaj drugą datę: ");
        dane =  reader.readLine();
        int dzien2 = Integer.parseInt(dane.substring(0, 2));
        int miesiac2 = Integer.parseInt(dane.substring(3, 5)) - 1;
        int rok2 = Integer.parseInt(dane.substring(6, 10)) - 1900;
        Date data2 = new Date(rok2, miesiac2, dzien2);
        // oblicz bezwzględną różnicę dat i przelicz ją na dni
        System.out.println("Różnica wynosi " + roznica(data1, data2) + " dni");
    }

    public static long roznica(Date data1, Date data2)
    {
        long roznica = Math.abs(data1.getTime() - data2.getTime());
        return roznica / ((long) (1000 * 60 * 60 * 24));
    }
}
