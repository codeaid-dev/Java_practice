import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedSample {
  public static void write(String path, String content) throws IOException {
    try (FileWriter fw = new FileWriter(path);
        BufferedWriter writer = new BufferedWriter(fw)) {
      writer.write(content);
    }
  }

  public static String read(String path) throws IOException {
    String content = "";
    try (FileReader fr = new FileReader(path);
        BufferedReader reader = new BufferedReader(fr)) {
      String data;
      while ((data = reader.readLine()) != null) {
        content += data + "\n";
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
