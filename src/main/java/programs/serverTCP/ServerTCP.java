package programs.serverTCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP extends Thread{

    private int serverPort;

    public ServerTCP(String name, int port) {
        this.serverPort = port;
        setName(name);
    }

    public void run() {
        ServerSocket serverSocket = null; //potrzebny do komunikacji strumieniowej per-to-per client-server.
        Socket connectedSocket = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;

        String responseMessage =
                "HTTP/1.1 200 OK\r\n\r\n"
                + "<!DOCTYPE html>"
                + "<html><head></head><title>Server TCP</title><body>"
                + "<br/><center><b>Witaj na serwerze TCP Akademii Kodu:)</br><center>"
                + "</body></html>";

        byte[] response = responseMessage.getBytes();
        byte[] buffer = new byte[2048];

        try {
            serverSocket = new ServerSocket(serverPort);
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (!this.isInterrupted()) {
            try {
                connectedSocket = serverSocket.accept();
                ConectedTCP myThred = new ConectedTCP("server");
                myThred.start();
                inputStream = connectedSocket.getInputStream();
                outputStream = connectedSocket.getOutputStream();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                outputStream.write(response);
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                int counter = inputStream.read(buffer);
                if(counter > 0) {
                    String testMessage = new String(buffer,0,buffer.length);
                    System.out.println(testMessage);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                outputStream.flush(); //opóźnia strumień wyjściowy i wymusza zapisanie danych z bufora;
                outputStream.close();
                inputStream.close();
                connectedSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }



        }






    }

}
