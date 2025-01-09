import java.io.File;

public class Ex3 {
  public static void main(String[] args) {
    File file = new File("output.txt");
    if (file.exists()) {
      System.out.println("ファイルはあります");
      System.out.println("ファイルサイズ：" + file.length() + "バイト");
    } else {
      System.out.println("ファイルがありません");
    }
  }
}
