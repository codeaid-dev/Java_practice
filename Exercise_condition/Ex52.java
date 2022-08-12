public class Ex52 {
  public static void main(String[] args) {
    String[] uranai = {"今日は最高！","今日はそこそこです","今日はまぁまぁ","今日は最悪・・・"};
    for (int i=0; i<uranai.length; i++) {
      int r = new java.util.Random().nextInt(uranai.length-1);
      String w = uranai[i];
      uranai[i] = uranai[r];
      uranai[r] = w;
    }
    System.out.print("0~3を選択>>");
    int u = new java.util.Scanner(System.in).nextInt();
    if (u >= 0 && u <= 3) {
      System.out.println(uranai[u]);
    } else {
      System.out.println("占えません");
    }
  }
}
