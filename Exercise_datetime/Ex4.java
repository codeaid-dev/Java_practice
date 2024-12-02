import java.util.Calendar;
import java.util.Scanner;

public class Ex4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("年を入力してください: ");
    int year = scanner.nextInt();
    System.out.print("月を入力してください: ");
    int month = scanner.nextInt(); // 1月=1, 2月=2...
    System.out.print("日を入力してください: ");
    int day = scanner.nextInt();
    Calendar calendar = Calendar.getInstance();
    calendar.set(year, month - 1, day); // 月は0から始まる
    calendar.add(Calendar.DAY_OF_MONTH, 1);

    System.out.println("翌日: " + calendar.get(Calendar.YEAR) + "年" +
            (calendar.get(Calendar.MONTH) + 1) + "月" +
            calendar.get(Calendar.DAY_OF_MONTH) + "日");
  }
}
