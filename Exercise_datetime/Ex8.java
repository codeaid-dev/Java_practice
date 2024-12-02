import java.time.LocalDateTime;

public class Ex8 {
  public static void main(String[] args) {
    LocalDateTime now = LocalDateTime.now();
    System.out.println("現在の日時: " +
                  now.getYear() + "年" +
                  now.getMonthValue() + "月" +
                  now.getDayOfMonth() + "日" +
                  now.getHour() + "時" +
                  now.getMinute() + "分");
    LocalDateTime future = now.plusDays(2).plusHours(3);
    System.out.println("2日と3時間後の日時: " +
                  future.getYear() + "年" +
                  future.getMonthValue() + "月" +
                  future.getDayOfMonth() + "日" +
                  future.getHour() + "時" +
                  future.getMinute() + "分");
  }
}
