import java.io.IOException;
import java.io.FileWriter;
public class ToTextFile {
  public static void main(String[] args) {
    try {
      FileWriter writer = new FileWriter("output.txt");
      writer.write("こんにちは");
      //writer.flush();
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
