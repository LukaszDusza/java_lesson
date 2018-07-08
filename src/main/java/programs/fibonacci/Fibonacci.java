package programs.fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        long preTime = System.currentTimeMillis();
        System.out.println("Value " + fibonacci(32));
        long postTime = System.currentTimeMillis();
        System.out.println("time taken to compute in milisec: " + (postTime - preTime));
    }


    public static long fibonacci(long n) {

        if( n == 0) {
            return 0;
        } else  if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }


    }

}
