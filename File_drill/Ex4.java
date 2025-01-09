import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4 {
  public static void main(String[] args) {
      try (InputStreamReader reader = new InputStreamReader(
            new FileInputStream("input.txt"), "UTF-8")) {
      int data;
      while ((data = reader.read()) != -1) {
        System.out.print((char)data);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
