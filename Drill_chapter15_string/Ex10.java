public class Ex10 {
  public static void main(String[] args) {
    System.out.print("入力 >>");
    String[] t = new java.util.Scanner(System.in).nextLine().split(",");
    int hour = Integer.parseInt(t[0]);
    int minutes = Integer.parseInt(t[1]);
    minutes += 5;
    hour += minutes/60;
    System.out.println(String.format("%02d時%02d分",hour,minutes%60));
  }
}
