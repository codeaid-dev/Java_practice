import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Ex10 {
  public static void main(String[] args) {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH時mm分");
    ZonedDateTime tokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
    ZonedDateTime newyork = tokyo.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
    String s1 = tokyo.format(dtf);
    String s2 = newyork.format(dtf);
    System.out.println("東京の日時："+s1);
    System.out.println("ロサンゼルスの日時："+s2);
  }
}
