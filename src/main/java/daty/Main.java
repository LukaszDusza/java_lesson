package daty;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {



    public static void main(String[] args) {

        currentDateToString();
        fromStringToDate("10.07.2018 23:10:10");
        currentDateFromCalendar();
        setCalendar(2018, 01, 14, 10, 59, 40);
        calendarDateVuceVersa();


    }


    public static String currentDateToString() {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String dateString = dateFormat.format(currentDate);
        System.out.println(dateString);
        return dateString;
    }

    public static Date fromStringToDate(String dateString) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        Date date = null;
        try {
            date = dateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
        return date;
    }

    public static void currentDateFromCalendar() {
        // Pobranie aktualnego czasu wykorzystując Calendar
        Calendar calendar = Calendar.getInstance();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println(dateFormat.format(calendar.getTime()));

// Pobranie aktualnego roku
        System.out.println("Rok: \t\t\t\t" + calendar.get(Calendar.YEAR));
// Pobranie aktualnego miesiąca (0 - styczeń, 1 - luty, ..., 11 - grudzień
        System.out.println("Miesiąc: \t\t\t" + calendar.get(Calendar.MONTH));
// Pobranie dnia miesiąca
        System.out.println("Dzień miesiąca: \t\t" + calendar.get(Calendar.DAY_OF_MONTH));
// Pobranie dnia tygodnia (1 - poniedziałek)
        System.out.println("Dzień tygodnia: \t\t" + calendar.get(Calendar.DAY_OF_WEEK));
// Pobranie numeru tygodnia
        System.out.println("Numer tygodnia w roku: \t\t" + calendar.get(Calendar.WEEK_OF_YEAR));

// Pobranie godziny w dwunastogodzinnym trybie (1-12)
        System.out.println("Godzina (1-12): \t\t" + calendar.get(Calendar.HOUR));
// Pobranie godziny (24h)
        System.out.println("Godzina (1-24): \t\t" + calendar.get(Calendar.HOUR_OF_DAY));
// Pobranie minuty
        System.out.println("Minuta: \t\t\t" + calendar.get(Calendar.MINUTE));
// Pobranie sekundy z Calendar
        System.out.println("Sekunda: \t\t\t" + calendar.get(Calendar.SECOND));
// Pobranie milisekundy z Java Calendar
        System.out.println("Milisekunda: \t\t\t" + calendar.get(Calendar.MILLISECOND));
    }

    public static void setCalendar(int year,int month, int dayOfMonth, int hourOfDay, int minute, int second) {
        // Ręczne ustawianie czasu używając Calendar
        Calendar calendar = new GregorianCalendar(year, month, dayOfMonth, hourOfDay, minute, second);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        System.out.println(dateFormat.format(calendar.getTime()));
    }

    public static void calendarDateVuceVersa() {
        // Konwersja Java Date; Java Calendar; Java Date
        Date date = new Date();
        System.out.println("Data i godzina typu (Java) Date: " + date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println("Data i godzina przechowywana w obiekcie typu (Java) calendar: " + calendar.getTime());
// Konwersja Calendar -&gt; Java Date
        date = calendar.getTime();
        System.out.println("I znów data i godzina typu Date: " + date);
    }
}
