public class Ex18 {
  public static void main(String[] args) {
    String[] seasons = {"冬", "春", "夏", "秋"};
    System.out.print("1~12で月を入力>>");
    int month = new java.util.Scanner(System.in).nextInt();
//    int month = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    System.out.println(month+"月は、"+seasons[month/3%4]+"です");
  }
}
