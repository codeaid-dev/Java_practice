import java.io.File;
import java.util.Scanner;

public class FileSample {
  public static void main(String[] args) {
    System.out.print("パス>>");
    String path = new Scanner(System.in).nextLine();
    File dir = new File(path);
    for (File f : dir.listFiles()) {
      if (f.isFile()) {
        System.out.println(f.getName() + "（" + 
          f.length() + "バイト）");
      }
    }
  }
}
