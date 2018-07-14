package wyjatki.przyklad4;

public class MyException extends Exception{

    static private String messageException = "Wystąpił mój wyjątek";

    public static void myExceptionMessage() throws Exception{
        throw new Exception(messageException);
    }

}
