import java.util.Scanner;
public class StrInput {
  public static void main(String[] args) {
    System.out.print("配列に格納するデータを入力>>");
    String[] data = new Scanner(System.in).nextLine().split(",");
    System.out.println(java.util.Arrays.toString(data));
  }
}