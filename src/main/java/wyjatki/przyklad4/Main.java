package wyjatki.przyklad4;

public class Main {
    public static void main(String[] args)  {
        try {
            MyException.myExceptionMessage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
