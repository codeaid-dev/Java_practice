public class StaticSample {
  static int num; // staticフィールド
  // static初期化ブロック
  static {
    System.out.println("staticイニシャライザ");
    num = 10;
  }
  public StaticSample() {
    System.out.println("コンストラクタ: "+num);
  }
  public static void main(String[] args) {
    StaticSample s1 = new StaticSample();
    StaticSample s2 = new StaticSample();
  }
}
