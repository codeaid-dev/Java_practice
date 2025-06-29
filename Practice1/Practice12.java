public class Practice12 {
  public static void main(String[] args) {
    System.out.print("2022年何月何日？ >>");
    String in = new java.util.Scanner(System.in).nextLine();
//    String in = new java.util.Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    String[] ymd = in.split(",");
    int month = Integer.parseInt(ymd[0]);
    int date = Integer.parseInt(ymd[1]);
    String[] week = {"金曜日","土曜日","日曜日","月曜日","火曜日","水曜日","木曜日"}; //2022年1月1日の曜日に合わせる
    int month_length=0;
    for (int i=1; i<month; i++) {
      if (i == 4 || i == 6 || i == 9 || i == 11) {
        month_length += 30;
      } else if (i == 2) {
        month_length += 28;
      } else {
        month_length += 31;
      }
    }
    month_length += date;
    System.out.println("2022年"+month+"月"+date+"日は"+week[month_length%7]+"です");
  }
}
