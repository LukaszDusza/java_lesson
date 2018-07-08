package wzorce.singleton;

public class Main {
    public static void main(String[]args){
        MenedzerPlikow[] tab = new MenedzerPlikow[3];
        tab[0] = MenedzerPlikow.dawajMenedzer();
        tab[1] = MenedzerPlikow.dawajMenedzer();
        tab[2] = MenedzerPlikow.dawajMenedzer();

//        for(MenedzerPlikow object : tab)
//            object.about();
    }
}
