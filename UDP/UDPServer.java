import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
  public static void main(String[] args) throws IOException{
    int port = Integer.parseInt(args[0]);
    DatagramSocket socket = new DatagramSocket(port); // UDP受信用ソケット構築
    byte[] data = new byte[1024]; // 受信最大バッファ
    DatagramPacket packet = new DatagramPacket(data, data.length); // 受信用パケットを構築
    socket.receive(packet);
    data = packet.getData();
    InetAddress inet = packet.getAddress(); // client IP
    int p = packet.getPort(); // client port

    System.out.println("Receiving: " + new String(data) + " from client at " + inet.getHostAddress() + " on port " + p);

    packet.setData(data);
    socket.send(packet);
    socket.close();
  }
}
