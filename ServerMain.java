import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.io.IOException;

public class ServerMain {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(12345);
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        socket.receive(packet);

        String message = new String(packet.getData(), 0, packet.getLength());
        System.out.println("Received message: " + message);

        socket.close();
    }
}