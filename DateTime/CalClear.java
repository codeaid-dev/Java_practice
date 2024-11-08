import java.util.Calendar;
public class CalClear {
  public static void main(String[] args) {
    Calendar cal = Calendar.getInstance();
    System.out.println(cal.getTime());
    cal.clear(Calendar.SECOND);
    System.out.println(cal.getTime());
    cal.clear();
    System.out.println(cal.getTime());
  }
}
