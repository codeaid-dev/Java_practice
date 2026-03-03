import java.util.Calendar;
public class CalSet {
  public static void main(String[] args) {
    Calendar cal1 = Calendar.getInstance();
    cal1.set(2026, 11, 24, 20, 05, 32);
    System.out.println(cal1.getTime());
    Calendar cal2 = Calendar.getInstance();
    cal2.set(Calendar.YEAR, 2025);
    System.out.println(cal2.getTime());
  }
}
