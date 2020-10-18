import java.net.*;
import java.util.*;

public class IPHostAddress {
  public static void main(String[] args) {
    try {
      InetAddress inet  = InetAddress.getLocalHost();
      //InetAddress inet = InetAddress.getByName("xxx.xxx.xxx.xxx");

      String ip = inet.getHostAddress(); // IP Address
      System.out.println("IP Address: " + ip);
      String hostname = inet.getHostName(); // Host Name
      System.out.println("Host Name: " + hostname);


      } catch (Exception e) {
          //System.out.println("Unable to find address for " + e.getMessage);
          e.printStackTrace();
      }

      try {
        Enumeration <NetworkInterface> interfaceList;//集合内の列挙操作に使う古い型
        interfaceList = NetworkInterface.getNetworkInterfaces();
        while(interfaceList.hasMoreElements()){//すべてのインターフェイスを走査
          NetworkInterface nInterface = (NetworkInterface)interfaceList.nextElement();
          System.out.print("  " + nInterface.getName() );//ネットワーク識別名
        }
      } catch (SocketException se) {
        //System.out.println("Error getting network interfaces: " + se.getMessage);
        se.printStackTrace();
    }
  }
}
