import java.util.Calendar;

public class Ex1 {
  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();
    int year = calendar.get(Calendar.YEAR);
    int month = calendar.get(Calendar.MONTH) + 1; // 月は0から始まるので+1
    int day = calendar.get(Calendar.DAY_OF_MONTH);

    System.out.println("年: " + year);
    System.out.println("月: " + month);
    System.out.println("日: " + day);
  }
}
