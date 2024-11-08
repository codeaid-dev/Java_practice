import java.util.Calendar;
public class CalCompare {
  public static void main(String[] args) {
    Calendar cal = Calendar.getInstance();
    Calendar cal2 = Calendar.getInstance();
    cal.set(Calendar.YEAR, 2024);
    cal2.set(Calendar.YEAR, 2019);
    System.out.println(cal.before(cal2));
    System.out.println(cal.equals(cal2));
    System.out.println(cal.after(cal2));
  }
}
