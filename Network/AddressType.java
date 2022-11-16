import java.net.InetAddress;

public class AddressType {
  public static void main(String[] args) {
    try {
      InetAddress addr = InetAddress.getByName(args[0]);
      String hostname = addr.getHostName();
      String hostaddress = addr.getHostAddress();
      String str = (hostname.equals(hostaddress) ? "/"+hostaddress : hostname+"/"+hostaddress);
      if (addr.isAnyLocalAddress() || addr.isLoopbackAddress()) {
        System.out.println(str + " is loopback address.");
      } else {
        System.out.println(str + " is global address.");
      }
      if (addr.isMulticastAddress()) {
        System.out.println(str + " is interface-local multicast address.");
      } else {
        System.out.println(str + " is unicast address.");
      }
    } catch (Exception e) {
      System.out.println("Could not resolut: "+args[0]);
    }
  }
}
