package daty.example;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) throws ParseException {
        // Pobierz wczorajszą datę i godzinę
        Date yesterday = getYesterdayDate();
        System.out.println("Wczoraj: " + yesterday);

        // Pobierz wczorajszą datę i godzinę jako String
        String yesterdayStr = getYesterdayDateString();
        System.out.println("Wczoraj (sformatowany String yyyy/MM/dd HH:mm:ss): " + yesterdayStr);

        // Pobierz datę i godzinę sprzed tygodnia (jako String)
        String weekAgo = getAWeekAgo();
        System.out.println("Tydzień temu (sformatowany String yyyy/MM/dd HH:mm:ss): " + weekAgo);

        // Pobierz datę i godzinę sprzed pół roku (jako obiekt typu Date)
        Date halfAYearAgo = getHalfAYearAgo();
        System.out.println("Pół roku temu: " + halfAYearAgo);

        // Ustaw konkretną datę i godzinę
        Date date = setDate("1971/12/23 23:20:13", "yyyy/MM/dd HH:mm:ss");
        System.out.println("Ustawiona konkretna data i godzina: " + date);
    }

    public static Date getYesterdayDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        return calendar.getTime();
    }

    public static String getYesterdayDateString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        return dateFormat.format(calendar.getTime());
    }

    public static String getAWeekAgo(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, -7);
        return dateFormat.format(calendar.getTime());
    }

    public static Date getHalfAYearAgo(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, -6);
        return calendar.getTime();
    }

    public static Date setDate(String dateStr, String format) throws ParseException{
        DateFormat dateFormat = new SimpleDateFormat(format);
        Date date = dateFormat.parse(dateStr);
        return date;
    }
}
