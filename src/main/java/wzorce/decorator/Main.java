package wzorce.decorator;

public class Main {


    public static void main(String[] args) {
        Samochod mercedes = new Mercedes();
        Samochod audi = new Audi();

        //bez dekoracji
        System.out.println("Mercedes: " + mercedes.cena());
        System.out.println("Audi: " + audi.cena());

        mercedes = new OponyZimowe(mercedes);
        audi = new OponyZimowe(audi);

        //z dekoracją
        System.out.println("Mercedes z oponami: " + mercedes.cena());
        System.out.println("Audi z oponami: " + audi.cena());

        Samochod mercedes2 = new OponyZimowe(new Mercedes());
        System.out.println("Mercedes2 z oponami: " + mercedes2.cena());

        Samochod audi2 = new Audi();
        audi2 = new OponyZimowe(audi2);
        audi2 = new Klimatyzacja(audi2);

        System.out.println(audi2.about() + " cena: " + audi2.cena());



    }



}
