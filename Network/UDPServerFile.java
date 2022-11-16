import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.io.FileWriter;
import java.io.PrintWriter;

public class UDPServerFile {
  public static void main(String[] args) throws IOException{
    int port = Integer.parseInt(args[0]);
    DatagramSocket socket = new DatagramSocket(port); // UDP受信用ソケット構築
    byte[] data = new byte[1024]; // 受信最大バッファ
    DatagramPacket packet = new DatagramPacket(data, data.length); // 受信用パケットを構築
    socket.receive(packet);
    data = packet.getData();
    String strAddr = packet.getAddress().getHostAddress(); // client IP
    int iPort = packet.getPort(); // client port

    String log = "Receiving: " + new String(data) + " (" + packet.getLength() + " bytes)" +" from client at " + strAddr + " on port " + iPort;
    System.out.println(log);

    try {
      FileWriter fw = new FileWriter(args[1]);
      PrintWriter pw = new PrintWriter(fw);
      pw.println(log);
      pw.close();
    } catch(IOException e) {
      System.out.println(e);
    }

    packet.setData(data);
    socket.send(packet);
    socket.close();
  }
}
