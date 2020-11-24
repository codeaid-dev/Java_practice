import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UDPClient{
  public static void main(String[] args) throws IOException{
    String host = args[0];
    int port = Integer.parseInt(args[1]);
    String message = args[2];

    DatagramSocket socket = new DatagramSocket(); //UDPソケット構築

    byte[] sData = message.getBytes("UTF-8");
    DatagramPacket packet = new DatagramPacket(sData, sData.length, new InetSocketAddress(host,port)); // UDP送信パケット構築
    packet.setData(sData);
    socket.send(packet);
    System.out.println("Send: \"" + message + "\" / packet length: " + packet.getLength());

    byte[] rData = new byte[1024];
    packet = new DatagramPacket(rData, rData.length, new InetSocketAddress(host,port)); // UDP受信パケット構築
    socket.receive(packet);
    rData = packet.getData();
    System.out.println("Reveived: \"" + new String(rData) + "\" / packet length: " + packet.getLength());
    socket.close();
  }
}
