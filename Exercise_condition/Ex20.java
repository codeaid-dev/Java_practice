public class Ex20 {
  public static void main(String[] args) {
    int uranai = new java.util.Random().nextInt(10);
    if (uranai == 0) {
      System.out.println("今日は最高");
    } else if (uranai >= 1 && uranai <= 3) {
      System.out.println("今日はそこそこ");
    } else if (uranai >=4 && uranai <= 7) {
      System.out.println("今日はまぁまぁ");
    } else {
      System.out.println("今日は最悪・・・");
    }
  }
}
