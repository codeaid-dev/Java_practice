import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.io.FileWriter;
import java.io.PrintWriter;

public class UDPServerPrefix {
  public static void main(String[] args) throws IOException{
    int port = Integer.parseInt(args[0]);
    DatagramSocket socket = new DatagramSocket(port); // UDPソケット構築
    byte[] data = new byte[1024];
    DatagramPacket packet = new DatagramPacket(data, data.length); // UDPパケット構築
    socket.receive(packet);
    data = packet.getData();
    String strAddr = packet.getAddress().getHostAddress(); // client IP
    int iPort = packet.getPort(); // client port

    String log = "Receiving: " + new String(data) + " (" + packet.getLength() + " bytes)" +" from client at " + strAddr + " on port " + iPort;
    System.out.println(log);

    StringBuffer buf = new StringBuffer();
    buf.append(new String(args[2]));
    buf.append(new String(data));
    String nStr = buf.toString();
    byte[] reply = nStr.getBytes("UTF-8");

    try {
      FileWriter fw = new FileWriter(args[1]);
      PrintWriter pw = new PrintWriter(fw);
      pw.println(log);
      pw.close();
    } catch(IOException e) {
      System.out.println(e);
    }

    packet.setData(reply);
    socket.send(packet);
    System.out.println("Send: \"" + nStr + "\" / packet length: " + packet.getLength());
    socket.close();
  }
}
