package wyjatki.przyklad2;

public class Main {
    public static void main(String[] args) {

        try {
            dzielenie(1, 0);
        } catch (ArithmeticException e) {
            System.out.println("nie dziel przez zero.");
            e.printStackTrace();


        }
    }

    //tu ten wyjatek nie nastapi. throws sluzy do oznaczania wyjatkow obslugiwalntch.
    //wyjatki nieobslugiwalne nie wymagaja throws.
    public static int dzielenie(int a, int b) {
        return a/b;
    }
}
