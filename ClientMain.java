import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.io.IOException;

public class ClientMain {
    public static void main(String[] args){
        try {
            DatagramSocket socket = new DatagramSocket();
            byte[] data = "Hello, world!".getBytes();
            InetAddress address;
            try {
                address = InetAddress.getByName("localhost");
                int port = 12345;
                DatagramPacket packet = new DatagramPacket(data, data.length, address, port); 
                try {
                    socket.send(packet);
                    socket.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            } catch (UnknownHostException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        } catch (SocketException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
