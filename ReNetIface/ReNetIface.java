import java.net.*;

public class ReNetIface {
  public static void main(String[] args) {
    try {
      InetAddress addrList[] = InetAddress.getAllByName(args[0]);

      for (int i=0; i<addrList.length; i++) {
        System.out.println(addrList[i].getHostName() + "/" + addrList[i].getHostAddress() + ((addrList[i] instanceof Inet4Address ? "(v4)" : (addrList[i] instanceof Inet6Address ? "(v6)" : "(?)"))));
      }
    } catch (Exception e) {
      System.out.println("Unable to find address for " + args[0]);
    }
  }
}
