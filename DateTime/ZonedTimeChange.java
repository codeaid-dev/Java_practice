import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedTimeChange {
  public static void main(String[] args) {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH時mm分ss秒");
    LocalDateTime local = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
    ZonedDateTime tokyo = local.atZone(ZoneId.of("Asia/Tokyo"));
//    ZonedDateTime newyork = local.atZone(ZoneId.of("America/New_York"));
    ZonedDateTime newyork = tokyo.withZoneSameInstant(ZoneId.of("America/New_York"));
//    String s1 = local.format(dtf);
    String s2 = tokyo.format(dtf);
    String s3 = newyork.format(dtf);
//    System.out.println(local);
    System.out.println(tokyo);
    System.out.println(newyork);
//    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
  }
}
