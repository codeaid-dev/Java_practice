import java.util.Scanner;

public class Ex11 {
  public static void main(String[] args) {
    int num = 0;
    while (num <= 0) {
      System.out.print("正の整数を入力してください：");
      num = new Scanner(System.in).nextInt();
    }
    int count = 0;
    int temp = num;
    while (temp > 0) {
      temp /= 10;
      count++;
    }
    System.out.println(num + "は" + count + "桁です。");
  }
}
