import java.util.Scanner;

public class Ex21 {
  public static void main(String[] args) {
    System.out.print("入力 >>");
    int num = new Scanner(System.in).nextInt();
    for (int i = 0; i < num; i++) {
      System.out.print((i / 5) % 10);
    }
  }
}
