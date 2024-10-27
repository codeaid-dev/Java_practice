public class WhileSample {
  public static void main(String[] args) {
    int val = 0;
    while (val < 5) {
      System.out.print(val + "-");
      val++;
    }
    System.out.println("");
    do {
      System.out.print(val + "-");
      val++;
    } while (val < 5);
    System.out.println("");
  }
}
