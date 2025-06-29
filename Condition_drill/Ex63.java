public class Ex63 {
  public static void main(String[] args) {
    String[] seiza = {"山羊座","水瓶座","魚座","牡羊座","牡牛座","双子座","蟹座","獅子座","乙女座","天秤座","蠍座","射手座"};
    int[] date = {19,18,20,19,20,21,22,22,22,23,22,21};
    System.out.print("生まれた月日 >>");
    String s = new java.util.Scanner(System.in).nextLine();
//    String s = new java.util.Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    String[] birthday = s.split("/");
    int month = Integer.parseInt(birthday[0]);
    int day = Integer.parseInt(birthday[1]);
    if (date[month-1] >= day)
      System.out.println(month+"月"+day+"日は"+seiza[month-1]+"です");
    else
      System.out.println(month+"月"+day+"日は"+seiza[month%12]+"です");
  }
}
