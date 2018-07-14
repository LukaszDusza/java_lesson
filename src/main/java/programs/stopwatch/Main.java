package programs.stopwatch;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    static private long startTime;
    static private long stopTime;
    public static final double NANOS_PER_SEC = 1000000000.0;


    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>();

        start();
        for (int i = 0; i < 10000; i++) {
            Random r = new Random();
            numbers.add(r.nextInt());
        }
        stop();
        System.out.println(time());
        resetCounter();

        start();
        for (int i = 0; i < numbers.size(); i++) {
            numbers.remove(i);
        }
        stop();
        System.out.println(time());
        resetCounter();



    //    double d = timeInNanoseconds();
    //    double t = time();
     //   System.out.println(d);
     //   System.out.println(time());
    }


    /**
     start the stop watch.
     */
    public static void start(){
        startTime = System.nanoTime();
    }

    /**
     stop the stop watch.
     */
    public static void stop() {
        stopTime = System.nanoTime();
    }

    /**
     elapsed time in seconds.
     @return the time recorded on the stopwatch in seconds
     */
    public static double time()
    {	return (stopTime - startTime) / NANOS_PER_SEC;	}

    public static void resetCounter() {
        stopTime = 0;
        startTime = 0;
    }

    public String toString(){
        return "elapsed time: " + time() + " seconds.";
    }

    /**
     elapsed time in nanoseconds.
     @return the time recorded on the stopwatch in nanoseconds
     */
    public static long timeInNanoseconds()
    {	return (stopTime - startTime);	}

}
