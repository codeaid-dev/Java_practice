import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeFormat {
  public static void main(String[] args) {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH時mm分ss秒");
    LocalDateTime now = LocalDateTime.now();
    LocalDateTime tokyo = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
    LocalDateTime newyork = LocalDateTime.now(ZoneId.of("America/New_York"));
    String s1 = now.format(dtf);
    System.out.println("システム現在日時："+s1);
    String s2 = tokyo.format(dtf);
    System.out.println("東京現在日時："+s2);
    String s3 = newyork.format(dtf);
    System.out.println("ニューヨーク現在日時："+s3);
  }
}
