public class Ex4 {
  public static void main(String[] args) {
    String words = "しばらくすると信号機が赤に変わった";
    int index = words.indexOf("赤");
    System.out.println(words.substring(0, index)+"青"+words.substring(index+1));
  }
}
