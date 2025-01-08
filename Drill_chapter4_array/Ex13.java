import java.util.Scanner;

public class Ex13 {
  public static void main(String[] args) {
    String[] weeks = {"月曜日","火曜日","水曜日","木曜日","金曜日","土曜日","日曜日"};
    System.out.print("7月何日？");
    int num = new Scanner(System.in).nextInt();
    System.out.println(weeks[num % 7]);
  }
}
