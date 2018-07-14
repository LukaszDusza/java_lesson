package wyjatki.przyklad3;

public class Main {
    public static void main(String[] args) throws Exception {
        podajLiczbę2(3);
    }

    public static int podajLiczbę2(int a) throws Exception {
        if(a ==2) {
            return 2;
        } else {
           throw  new Exception("podales inna liczbe niz 2.");
        }
    }
}
