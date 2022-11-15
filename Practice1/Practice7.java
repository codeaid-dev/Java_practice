public class Practice7 {
  public static void main(String[] args) {
    String[] week = {"日","月","火","水","木","金","土"};
    double[] temp = {36.5,36.4,36.3,36.5,36.7,36.8,36.2};
    int q = new java.util.Random().nextInt(7);
    System.out.print(week[q]+"曜日のデータを入力 >>");
    double ans = new java.util.Scanner(System.in).nextDouble();
    if (ans == temp[q]) {
      System.out.println("正解！");
    } else {
      System.out.println("不正解");
    }
  }
}
