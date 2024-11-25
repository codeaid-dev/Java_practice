import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamIOSample {
  public static void main(String[] args) {
    try (BufferedInputStream reader = new BufferedInputStream(
          new FileInputStream("image.jpg"));
          BufferedOutputStream writer = new BufferedOutputStream(
          new FileOutputStream("output.jpg"))) {
      int data;
      while ((data = reader.read()) != -1) {
        writer.write(data);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
