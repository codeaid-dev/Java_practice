public class Ex47 {
  public static void main(String[] args) {
    String str = "東京,ニューヨーク,ロンドン,パリ,ローマ";
    String[] towns1 = str.split(",");
    String[] towns2 = new String[towns1.length];
    System.arraycopy(towns1, 0, towns2, 0, towns1.length);
    towns2[1] = "マドリード";
    towns2[3] = "ベルリン";
    System.out.println(java.util.Arrays.toString(towns1));
    System.out.println(java.util.Arrays.toString(towns2));
  }
}
