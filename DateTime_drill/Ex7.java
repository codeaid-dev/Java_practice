import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ex7 {
  public static void main(String[] args) {
    System.out.print("日時>>");
    String str = new Scanner(System.in).nextLine();
//    String str = new Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    String[] work = str.split(",");
    LocalDateTime local = LocalDateTime.of(Integer.parseInt(work[0]),
                          Integer.parseInt(work[1]),
                          Integer.parseInt(work[2]),
                          Integer.parseInt(work[3]),
                          Integer.parseInt(work[4]));
    /*
    int[] datetime = Stream.of(work).mapToInt(Integer::parseInt).toArray();
    LocalDateTime local = LocalDateTime.of(datetime[0],
                          datetime[1],
                          datetime[2],
                          datetime[3],
                          datetime[4]);
    */
    LocalDateTime past = local.minusHours(5);
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH時mm分");
    System.out.println("5時間前の日時: " + past.format(dtf));
    /*
    System.out.println("5時間前の日時: " +
              past.getYear() + "年" +
              past.getMonthValue() + "月" +
              past.getDayOfMonth() + "日 " +
              past.getHour() + "時" +
              past.getMinute() + "分");
    */
  }
}
