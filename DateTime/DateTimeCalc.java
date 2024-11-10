import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
public class DateTimeCalc {
  public static void main(String[] args) {
    LocalDateTime local = LocalDateTime.parse("2025-12-24T23:30");
    System.out.println(local);
    System.out.println(local.plus(1, ChronoUnit.YEARS));
    System.out.println(local.plusMonths(3));
    System.out.println(local.minusDays(10));
  }
}
