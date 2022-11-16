import java.net.*;
import java.io.*;

public class TCPServer {
  public static void main(String[] args) {
    ServerSocket server = null;
    Socket socket = null;
    try {
      int port = Integer.parseInt(args[0]);
      server = new ServerSocket(port);
      System.out.println("sever start...");
      socket = server.accept();

      System.out.println("client: "+socket.getInetAddress().getLocalHost()+" access successed");
      //System.out.println("client: "+socket.getInetAddress().getHostName()+" access successed");
      System.out.println("client:access successed");

      InputStream is = socket.getInputStream();
      OutputStream os = socket.getOutputStream();

      BufferedReader br = new BufferedReader(new InputStreamReader(is));
      String str = br.readLine();
      System.out.println("from client: " + str);
      //while (str != null) {
        //System.out.println("from client: " + str);
        //str = br.readLine();
      //}

      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
      bw.write(str + "\n");
      bw.flush();
      System.out.println("to client: " + str);

    } catch(Exception e) {
      e.printStackTrace();
      System.out.println("Socket error.");
    } finally {
      try {
        socket.close();
        server.close();
      } catch(IOException ioe) {
        ioe.printStackTrace();
        System.out.println("close error.");
      }
    }

  }
}
