import java.time.LocalDate;
public class DateTimeAorB {
  public static void main(String[] args) {
    LocalDate local1 = LocalDate.parse("2024-12-24");
    System.out.println(local1);
    LocalDate local2 = local1.plusDays(100);
    System.out.println("100日後は"+local2);
    LocalDate now = LocalDate.now();
    if (now.isAfter(local2)) {
      System.out.println("本日"+now+"はその日より未来です。");
    } else {
      System.out.println("本日"+now+"はその日より過去です。");
    }
  }
}
