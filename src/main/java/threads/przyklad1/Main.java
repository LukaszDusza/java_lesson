package threads.przyklad1;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread threadOne = new Thread(new MyThreadOne());
        Thread threadTwo = new Thread(new MyThreadTwo());

        threadOne.start(); //startujemy pierwszy watek.

        threadOne.join(2000);  // zakladamy join na watku pierwszym.

        threadTwo.start(); //drugi watek startuje.

        threadOne.join();  //koniec join pierwszego watku


      //  System.out.println("wątek główny " + Thread.currentThread());

    }
}
