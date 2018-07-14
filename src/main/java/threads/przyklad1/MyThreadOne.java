package threads.przyklad1;

public class MyThreadOne implements Runnable{

    private static int counter = 0;
    private static String threadName = "MyThreadOne";



    @Override
    public void run() {
        counting(200, threadName);
    }


    public static void counting(int i, String threadName)  {

        for (int j = 0;  j < i; ++j) {
            System.out.println(threadName + " " + counter++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }





}
