package programs.pesel;

public class Main {

    public static void main(String[] args) {
        PeselValidator peselValidator = new PeselValidator("87041412694");

        boolean b = peselValidator.isValid();
        System.out.println(b);
    }


}
