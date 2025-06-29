import java.util.Scanner;
public class UNIXTime {
  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    String str = "";
    while (!str.equals("abcdefghijklmnopqrstuvwxyz")) {
      System.out.print("入力>>");
      str = new Scanner(System.in).nextLine();
//      str = new Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    }
    long end = System.currentTimeMillis();
    System.out.println("かかった時間："+(end-start)/1000+"秒");
  }
}
