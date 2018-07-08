package wzorce.observer.sample_1;


//Obserwator (ang. observer) - wzorzec z rodziny wzorców operacyjnych.
// Składa się z obiektu, który nazywamy "obiektem obserwowanym"
// oraz pewnej liczy obiektów obserwujących. Występuje tutaj relacja typu jeden do wielu.
// Obiekt obserwowany jest zarządcą danych, informuje on wszystkich swoich obserwatorów
// o zmianach w danych, które zawiera. Jest on jedynym prawowitym właścicielem owych danych.
// Gdy obserwatorzy dostają informacje, że dane uległy zmianie, pobierają je od obiektu obserwowanego
// i dokonują aktualizacji w posiadanych przez siebie danych, pod kątem stanu danych obiektu obserwowanego.
// Obiekt obserwujący sam może zdecydować, czy dalej chce obserwować, ale również obiekt obserwowany
// może go usunąć z listy obserwatorów. Obserwator nie zna innych obserwujących,
// są oni niezależni od siebie (jakakolwiek modyfikacja jednego obserwatora nie wpływają na innych).
// Wzorzec charakteryzuje się łatwością dodawania nowych obserwujących (tworzymy nową klasę,
// która będzie implementować interfejs obserwator). Obiekt obserwujący sam może być obserwowanym (kompozycja).

public class Main {

    public static void main(String[] args) {

        TotoLotek totoLotek = new TotoLotek();
        Telewizja telewizja = new Telewizja(totoLotek);
        Internet internet = new Internet(totoLotek);

        totoLotek.dodajObserwatora(telewizja);
        totoLotek.dodajObserwatora(internet);
        totoLotek.kolejneLosowanie(); //losowanie nowych liczb
        System.out.println("pierwsze losowanie: ");
        telewizja.informuj();
        System.out.println("");
        internet.informuj();
        internet.usun();

        totoLotek.kolejneLosowanie(); //losowanie nowych liczb
        System.out.println("drugie losowanie: ");
        telewizja.informuj();
        internet.informuj();
    }

}
