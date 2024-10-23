import java.util.Scanner;
public class InputDoller {
  public static void main(String[] args) {
    System.out.print("米ドルを入力>>");
    int doller = new Scanner(System.in).nextInt();
    System.out.println((doller*151.65)+"円");
  }
}
