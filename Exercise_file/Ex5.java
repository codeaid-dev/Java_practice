import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex5 {
  public static void main(String[] args) {
    String str = "あいうえお\nかきくけこ\nabcde\nfghij\n";
    try (OutputStreamWriter writer = new OutputStreamWriter(
          new FileOutputStream("output.txt"), "UTF-8")) {
      writer.write(str);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
