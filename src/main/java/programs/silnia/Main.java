package programs.silnia;

public class Main {
    public static void main(String[] args) {

        System.out.println(silnia(10));
    }

    static long silnia(long n) {
        if(n == 0 || n == 1) {
            return 1;
        } else {
            return n * silnia((n-1));
        }
    }
}
