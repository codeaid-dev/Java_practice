import java.util.Scanner;

public class Uranai {
  public static void main(String[] args) {
    System.out.print("ENTER:占う　END:終了>");
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();

    while (!str.equals("END")) {
      int r = new java.util.Random().nextInt(100);
      if (r >= 0 && r <= 9) {
        System.out.println("おめでとう！大吉です！！");
      } else if (r >= 10 && r <= 29) {
        System.out.println("残念です。大凶です。。。");
      } else if (r >= 30 && r <= 69) {
        System.out.println("まぁまぁです。吉です。");
      } else {
        System.out.println("ちょっといいことあるかも。中吉です。");
      }
      System.out.print("ENTER:占う　END:終了>");
      str = scan.nextLine();
    }

    scan.close();
  }
}
