import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex6 {
  public static void main(String[] args) {
    try (FileInputStream fis = new FileInputStream("animal_bear_panda.png");
        FileOutputStream fos = new FileOutputStream("output.png")) {
      byte[] buffer = new byte[1024];
      int bytesRead;
      while ((bytesRead = fis.read(buffer)) != -1) {
        fos.write(buffer, 0, bytesRead);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
