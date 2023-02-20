import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.io.IOException;

public class ClientMain {
    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        DatagramSocket socket = new DatagramSocket();
        byte[] data = "Hello, world!".getBytes();
        InetAddress address = InetAddress.getByName("localhost");
        int port = 12345;
        DatagramPacket packet = new DatagramPacket(data, data.length, address, port); 
        socket.send(packet);
        socket.close();
    }
}
