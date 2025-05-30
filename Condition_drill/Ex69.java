public class Ex69 {
  public static void main(String[] args) {
    String[] week = {"日曜日","月曜日","火曜日","水曜日","木曜日","金曜日","土曜日"};
    System.out.print("年月日 >>");
    String[] ymd = new java.util.Scanner(System.in).nextLine().split(",");
    int year = Integer.parseInt(ymd[0]);
    int month = Integer.parseInt(ymd[1]);
    int date = Integer.parseInt(ymd[2]);
    if (month < 3) { // 1月と2月は13月、14月として計算する
      year--;
      month += 12;
    }
    // ツェラーの公式
    int h = (year+year/4-year/100+year/400+(13*month+8)/5+date) % 7;
    if (month > 12) {
      System.out.println((++year)+"年"+(month-12)+"月"+date+"日は"+week[h]+"です");
    } else {
      System.out.println(year+"年"+month+"月"+date+"日は"+week[h]+"です");
    }
  }
}
