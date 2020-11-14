import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UDPClient{
  public static void main(String[] args) throws IOException{
    String host = args[0];
    int port = Integer.parseInt(args[1]);
    String message = args[2];

    //UTF-8バイト配列の作成
    byte[] data = message.getBytes("UTF-8");
    //UDP送信用ソケットの構築
    DatagramSocket socket = new DatagramSocket();
    //指定アドレス、ポートへ送信するパケットを構築
    DatagramPacket packet = new DatagramPacket(data, data.length, new InetSocketAddress(host,port));
    packet.setData(data);
    socket.send(packet);
    socket.receive(packet);
    data = packet.getData();
    System.out.println("Reveived: " + new String(data));
    socket.close();
  }
}
