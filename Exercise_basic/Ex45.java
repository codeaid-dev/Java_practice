public class Ex45 {
  public static void main(String[] args) {
    String[] pref1 = {"大阪府","兵庫県","京都府"};
    String[] pref2 = {"奈良県","和歌山県","滋賀県"};
    String[] prefs = new String[pref1.length + pref2.length];
    System.arraycopy(pref1, 0, prefs, 0, pref1.length);
    System.arraycopy(pref2, 0, prefs, pref1.length, pref2.length);
    System.out.println(java.util.Arrays.toString(prefs));
  }
}
