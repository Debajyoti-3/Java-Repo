package Networking;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Socket_Client {
    public static void main(String[] args) throws Exception
    {
        String ip = "localhost"; // server ip address
        int port = 9999; // 0-1023 to 65535
        Socket sc = new Socket(ip,port);

        String str = "Debajyoti Mitra";

        // sending the data to server
        OutputStreamWriter os = new OutputStreamWriter(sc.getOutputStream());
        PrintWriter out = new PrintWriter(os);
        os.write(str);
        os.flush(); // forcefully send data


    }
}
