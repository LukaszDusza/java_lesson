package programs.ipAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpAddress {

    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();

            System.out.println("IP address: " + inetAddress.getHostAddress());
            System.out.println("Host name: " + inetAddress.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
