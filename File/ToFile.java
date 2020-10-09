import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class ToFile {
  public static void main(String[] args) {
    String str = "Information Networking Laboratory second";

    try {
      FileWriter fw = new FileWriter("output.txt");
      //BufferedWriter bw = new BufferedWriter(fw);
      //bw.write(str);
      //bw.newLine();
      PrintWriter bw = new PrintWriter(fw);
      bw.println(str);
      bw.close();
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
