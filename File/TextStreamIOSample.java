import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TextStreamIOSample {
    public static void main(String[] args) {
      try (InputStreamReader reader = new InputStreamReader(
            new FileInputStream("input.txt"), "UTF-8");
          OutputStreamWriter writer = new OutputStreamWriter(
            new FileOutputStream("output.txt"), "UTF-8")) {
      int data;
      while ((data = reader.read()) != -1) {
        System.out.print((char)data);
        writer.write(data);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
