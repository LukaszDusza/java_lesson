package programs.serverTCP;

public class Main {

    public static void main(String[] args) {
        ServerTCP server = new ServerTCP("server", 8081);
        server.start();
    }


}
