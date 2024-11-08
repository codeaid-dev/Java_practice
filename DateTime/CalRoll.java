import java.util.Calendar;
public class CalRoll {
  public static void main(String[] args) {
    Calendar cal = Calendar.getInstance();
    System.out.println(cal.getTime());
    cal.roll(Calendar.MINUTE, true);
    System.out.println(cal.getTime());
    cal.roll(Calendar.MINUTE, 50);
    System.out.println(cal.getTime());
  }
}
