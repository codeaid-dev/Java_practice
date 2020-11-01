import java.net.*;
import java.io.*;

public class TCPClient {
  public static void main(String[] args) {
    Socket socket = null;
    try {
      String host = args[0];
      String message = args[1];
      int port = Integer.parseInt(args[2]);

      socket = new Socket(host, port);

      InputStream is = socket.getInputStream();
      OutputStream os = socket.getOutputStream();

      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
      bw.write(message + "\n");
      bw.flush();
      System.out.println("to server: " + message);

      BufferedReader br = new BufferedReader(new InputStreamReader(is));
      String str = br.readLine();
      System.out.println("from server: " + str);
      //while (str != null) {
        //System.out.println("from server: " + str);
        //str = br.readLine();
      //}

    } catch(Exception e) {
      e.printStackTrace();
      System.out.println("Socket error.");
    } finally {
      try {
        socket.close();
      } catch(IOException ioe) {
        ioe.printStackTrace();
        System.out.println("close error.");
      }
    }
  }
}
