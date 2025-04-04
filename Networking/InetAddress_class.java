package Networking;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_class {
    public static void main(String[] args) {
        try {
            InetAddress ia = InetAddress.getByName("www.youtube.com");  // it retrieves the IP
            System.out.println("IP Adress: "+ ia.getHostAddress()); // it returns the IP
        }
        catch(UnknownHostException e){
            System.out.println("Error: "+e);
        }
    }
}
