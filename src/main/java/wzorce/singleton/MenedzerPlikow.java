package wzorce.singleton;

public class MenedzerPlikow {

    private int identyfikator;

    private MenedzerPlikow() {
        identyfikator = (int) ((Math.random() * 10) % 10);
    }

    //-------------------------------------------------------------------------------------------#1 sposob
//    private static MenedzerPlikow instancja = null;
//    public static synchronized MenedzerPlikow dawajMenedzer(){
//        if(instancja == null){
//            instancja = new MenedzerPlikow();
//            return instancja;
//        }
//        System.out.println("Menedzer juz zostal wczesniej utworzony!");
//        return instancja;
//    }
//
//    public void about(){
//        System.out.println("Identyfiaktor = " + identyfikator);
//    }

//-------------------------------------------------------------------------------------------#2 sposob
// nie inicjujemy tutan nullem, instancja juz od poczatku posiada wartosc


private final static MenedzerPlikow instancja = new MenedzerPlikow();
public static MenedzerPlikow dawajMenedzer(){
return instancja;

 }


//------------------------------------------------------------#3 sposob - metoda podwojnego blokowania

//private static volatile MenedzerPlikow instancja = null;
//public static MenedzerPlikow dawajMenedzer(){
//if(instancja == null){
//synchronized (MenedzerPlikow.class){
//instancja = new MenedzerPlikow();
//}
//}
//return instancja;
//}

}