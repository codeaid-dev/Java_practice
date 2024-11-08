import java.util.Calendar;
public class CalAdd {
  public static void main(String[] args) {
    Calendar cal = Calendar.getInstance();
    System.out.println(cal.getTime());
    cal.add(Calendar.YEAR, 3);
    System.out.println(cal.getTime());
    cal.add(Calendar.YEAR, -5);
    System.out.println(cal.getTime());
  }
}
