import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex2 {
  public static void main(String[] args) {
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    String time = sdf.format(new Date());
    System.out.println("現在時刻: " + time);
  }
}
