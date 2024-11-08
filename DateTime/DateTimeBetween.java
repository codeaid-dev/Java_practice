import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
public class DateTimeBetween {
  public static void main(String[] args) {
    LocalDateTime local1 = LocalDateTime.of(2023, 1, 1, 12, 30, 0, 0);
    LocalDateTime local2 = LocalDateTime.of(2024, 8, 13, 7, 15, 30, 0);
    System.out.println(local1);
    System.out.println(local2);
    Period period = Period.between(local1.toLocalDate(), local2.toLocalDate());
    System.out.println("日付の差：" + period);
    System.out.println( "日付の差：" +
      period.getYears() + "年" + period.getMonths() + "ヶ月" +
      period.getDays() + "日間");
    Duration duration = Duration.between(local1, local2);
    System.out.println( "時間の差：" + duration);
    System.out.println( "時間の差：" + duration.toHours() + "時間");
    System.out.println( "時間の差：" + duration.toMinutes() + "分間");
    System.out.println( "時間の差：" + duration.getSeconds() + "秒間");
  }
}
