import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
public class DateTimeAPI {
  public static void main(String[] args) {
    LocalDateTime local = LocalDateTime.now();
    System.out.println(local);
    OffsetDateTime offset = OffsetDateTime.of(
        2025, 12, 24, 15, 35, 30, 0, ZoneOffset.of("+09:00"));
    System.out.println(offset);
    ZonedDateTime zoned = ZonedDateTime.parse("2025-12-24T15:35:30+09:00[Asia/Tokyo]");
    System.out.println(zoned);
  }
}
