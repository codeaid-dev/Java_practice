import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ex6 {
  public static void main(String[] args) {
    System.out.print("日付1>>");
    String str1 = new Scanner(System.in).nextLine();
//    String str1 = new Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    System.out.print("日付2>>");
    String str2 = new Scanner(System.in).nextLine();
//    String str2 = new Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    LocalDate local1 = LocalDate.parse(str1);
    LocalDate local2 = LocalDate.parse(str2);
    Period period = Period.between(local1, local2);
    System.out.println("日付の差: " +
              Math.abs(period.getYears()) + "年" +
              Math.abs(period.getMonths()) + "ヶ月" +
              Math.abs(period.getDays()) + "日間");
  }
}
