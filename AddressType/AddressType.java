import java.net.InetAddress;

public class AddressType {
  public static void main(String[] args) {
    try {
      InetAddress addr = InetAddress.getByName(args[0]);
      if (addr.isAnyLocalAddress() || addr.isLoopbackAddress()) {
        System.out.println(addr.getHostName() + "/" + addr.getHostAddress()+" is loopback address.");
      } else {
        System.out.println(addr.getHostName() + "/" + addr.getHostAddress()+" is global address.");
      }
      if (addr.isMulticastAddress()) {
        System.out.println(addr.getHostName() + "/" + addr.getHostAddress()+" is interface-local multicast address.");
      } else {
        System.out.println(addr.getHostName() + "/" + addr.getHostAddress()+" is unicast address.");
      }
    } catch (Exception e) {
      System.out.println("Could not resolut: "+args[0]);
    }
  }
}
