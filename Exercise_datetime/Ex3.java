import java.util.Calendar;

public class Ex3 {
  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(2025, Calendar.DECEMBER, 25);
    int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
    String[] days = {"日曜日", "月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日"};
    System.out.println("2025年12月25日は " + days[dayOfWeek - 1]);
  }
}
