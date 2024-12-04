import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedTimeChange {
  public static void main(String[] args) {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH時mm分ss秒");
    ZonedDateTime tokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
    ZonedDateTime newyork = tokyo.withZoneSameInstant(ZoneId.of("America/New_York"));
    String s1 = tokyo.format(dtf);
    String s2 = newyork.format(dtf);
    System.out.println(tokyo);
    System.out.println(newyork);
    System.out.println(s1);
    System.out.println(s2);
  }
}
