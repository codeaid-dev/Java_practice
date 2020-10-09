import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FromFile {
  public static void main(String[] args) {
    String str;

    try {
      FileReader isr = new FileReader("input.txt");
      BufferedReader br = new BufferedReader(isr);

      str = br.readLine();
      while(str != null) {
        System.out.println(str);
        str = br.readLine();
      }
      System.out.println("end of file loading");
      br.close();
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}