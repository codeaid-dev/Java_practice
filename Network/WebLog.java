import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.net.InetAddress;

public class WebLog {
  public static void main(String[] args) {
    String str;

    try {
      FileReader isr = new FileReader(args[0]);
      BufferedReader br = new BufferedReader(isr);
      FileWriter fw = new FileWriter("output.txt");
      PrintWriter pw = new PrintWriter(fw);

      str = br.readLine();
      while(str != null) {
        String[] logtxt = str.split(" ", 0);
        String name = hostname(logtxt[0]);
        logtxt[0] = name;
        str = String.join(" ", logtxt);

        System.out.println(str);
        //pw.println(str);
        str = br.readLine();
      }
      br.close();
      pw.close();
    } catch (IOException e) {
      System.out.println(e);
    }
  }

  public static String hostname(String iptxt) {
    try {
      InetAddress ip1 = InetAddress.getByName(iptxt);
      return ip1.getHostName();
    } catch (Exception e) {
      //e.printStackTrace();
      return "Could not find IP adress for: " + iptxt;
    }
  }
}
