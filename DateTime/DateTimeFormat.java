import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
public class DateTimeFormat {
  public static void main(String[] args) {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date now1 = new Date();
    String s1 = sdf.format(now1);
    System.out.println("現在日時(SimpleDateFormat)："+s1);
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH時mm分ss秒");
    LocalDateTime now2 = LocalDateTime.now();
    String s2 = now2.format(dtf);
    System.out.println("現在日時(DateTimeFormatter)："+s2);
  }
}
