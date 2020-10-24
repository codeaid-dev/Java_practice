import java.net.InetAddress;

public class RemoteHost {
  public static void main(String[] args) {
    try {
      InetAddress ip1 = InetAddress.getByName(args[0]);
      System.out.println("IP address of " + ip1.getHostName() + " is: " + ip1.getHostAddress());
    } catch (Exception e) {
      //e.printStackTrace();
      System.out.println("Could not find IP adress for: " + args[0]);
    }
  }
}
