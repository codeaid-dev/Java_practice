import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryIOSample {
  public static void main(String[] args) {
    try (FileInputStream reader = new FileInputStream("image.jpg");
          FileOutputStream writer = new FileOutputStream("output.jpg")) {
      int data;
      while ((data = reader.read()) != -1) {
        writer.write((byte)data);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
