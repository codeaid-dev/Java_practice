import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {
  public static void main(String[] args) {
    try (FileWriter writer = new FileWriter("output.txt");
        FileReader reader = new FileReader("input.txt")) {
      String str = "";
      int data;
      while ((data = reader.read()) != -1) {
        str += (char)data;
      }
      writer.write(str);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
