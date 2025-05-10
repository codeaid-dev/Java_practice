import java.util.Scanner;

public class Ex12 {
  public static void main(String[] args) {
    int multiple = 0;
    while (multiple < 2 || multiple > 15) {
      System.out.print("指定倍数を入力：");
      multiple = new Scanner(System.in).nextInt();
    }
    for (int i = 1; i <= 100; i++) {
      if (i % multiple == 0) {
        System.out.println(multiple + "の倍数：" + i);
      }
    }
  }
}
