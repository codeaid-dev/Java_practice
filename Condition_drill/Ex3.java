import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    System.out.print("月を入力：");
    int month = new Scanner(System.in).nextInt();
    switch (month) {
      case 3,4,5 -> {
        System.out.println("春です");
      }
      case 6,7,8 -> {
        System.out.println("夏です");
      }
      case 9,10,11 -> {
        System.out.println("秋です");
      }
      case 12,1,2 -> {
        System.out.println("冬です");
      }
      default -> {
        System.out.println("1〜12の数字を入力してください");
      }
    }
  }
}
