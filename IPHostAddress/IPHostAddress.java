import java.net.*;
import java.util.*;

public class IPHostAddress {
  public static void main(String[] args) {
    try {
      InetAddress inet  = InetAddress.getLocalHost();
      //InetAddress inet = InetAddress.getByName("xxx.xxx.xxx.xxx");

      String ip = inet.getHostAddress();
      System.out.println("IP Address: " + ip);
      String hostname = inet.getHostName();
      System.out.println("Host Name: " + hostname);
      System.out.println("");

      } catch (Exception e) {
          System.out.println("Unable to find address for " + e.getMessage());
          e.printStackTrace();
      }

      try {
        Enumeration <NetworkInterface> interfaceList;
        interfaceList = NetworkInterface.getNetworkInterfaces();
        while(interfaceList.hasMoreElements()){
          NetworkInterface nInterface = interfaceList.nextElement();
          System.out.println("Interface " + nInterface.getName() + ": ");
          Enumeration <InetAddress> addrList = nInterface.getInetAddresses();
          if (!addrList.hasMoreElements()) continue;
          while(addrList.hasMoreElements()) {
            InetAddress address = addrList.nextElement();
            //System.out.print("\tAddress " + ((address instanceof Inet4Address ? "(IPv4)"
            //                                : (address instanceof Inet6Address ? "(IPv6)" : "(?)"))));
            System.out.println(": " + address.getHostAddress());
          }
        }
      } catch (SocketException se) {
        System.out.println("Error getting network interfaces: " + se.getMessage());
        se.printStackTrace();
    }
  }
}
