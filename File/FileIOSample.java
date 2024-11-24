import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOSample {
  public static void write(String path, String content) throws IOException {
    try (FileWriter writer = new FileWriter(path)) {
      writer.write(content);
    }
  }

  public static String read(String path) throws IOException {
    String content = "";
    try (FileReader reader = new FileReader(path)) {
      int ch;
      while ((ch = reader.read()) != -1) {
        content += (char) ch;
      }
    }
    return content;
  }

  public static void main(String[] args) {
    try {
      String content = read("input.txt");
      write("output.txt", content);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
