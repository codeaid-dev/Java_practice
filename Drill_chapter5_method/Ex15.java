public class Ex15 {
  public static void main(String[] args) {
    System.out.print("秒を入力: ");
    int input = new java.util.Scanner(System.in).nextInt();
    System.out.println(formatTime(input));
  }
  public static String formatTime(int seconds) {
    int hour = seconds / 3600;
    int min = (seconds % 3600) / 60;
    int sec = seconds % 60;
    return String.format("%02d:%02d:%02d", hour, min, sec);
  }
}
