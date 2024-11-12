import java.io.IOException;
import java.io.FileWriter;
public class ToTextFile {
  public static void main(String[] args) {
    FileWriter writer = null;
    try {
      writer = new FileWriter("output.txt");
      writer.write("こんにちは");
      //writer.flush();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (writer != null) {
        try {
          writer.close();
        } catch (IOException e) { ; }
      }
    }
  }
}
