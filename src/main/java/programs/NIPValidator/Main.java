package programs.NIPValidator;

public class Main {


    public static void main(String[] args) {
        NIPValidator nip = new NIPValidator("6581912302");

        System.out.println(nip.getDep());
        System.out.println(nip.isValid());
    }
}
