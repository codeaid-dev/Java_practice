import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex8 {
  public static void main(String[] args) {
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH時mm分");
    System.out.println("現在の日時: " + now.format(dtf));
    LocalDateTime future = now.plusDays(2).plusHours(3);
    System.out.println("2日と3時間後の日時: " + future.format(dtf));
  }
}
